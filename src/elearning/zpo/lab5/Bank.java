package elearning.zpo.lab5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


class Bank {

    private Map accounts;

    private Bank() {
        accounts = new HashMap();
    }

    /**
     * Creating an account
     *
     * @param id
     * @param owner's name
     * @param owner's surname
     * @throws BankingException
     */
    private void createAccount(String id, String name, String surname)
            throws BankingException {
        if (Account(id) != null)
            throw new BankingException("This Account ID already exists!");
        Account account = new Account(id, name, surname);
        accounts.put(id, account);
    }


    /**
     * Searches for Account with a given id number
     *
     * @param id
     * @return
     */
    private Account Account(String id) {
        return (Account) accounts.get(id);
    }

    /**
     * Returns an iterator for account list
     *
     * @return
     */
    private Iterator listAccounts() {
        return accounts.values().iterator();
    }

    /**
     * Transfer z rachunku na Account
     *
     * @param accountFrom
     * @param accountTo
     * @param ammount
     * @throws BankingException
     */
    public void Transfer(Account accountFrom, Account accountTo, double ammount)
            throws BankingException {
        accountFrom.transferTo(accountTo, ammount);
    }

    /**
     * Transfer from one account to another
     *
     * @param idFrom
     * @param idTo
     * @param ammount
     * @throws BankingException
     */
    public void Transfer(String idFrom, String idTo, double ammount)
            throws BankingException {
        Account accountFrom = Account(idFrom);
        Account accountTo = Account(idTo);

        accountFrom.transferTo(accountTo, ammount);
    }

    public static void main(String[] args)
            throws BankingException {
        Bank bank = new Bank();
        bank.createAccount("123", "Jan", "Kowalski");
        bank.createAccount("23", "Anna", "Nowak");

        Account Account123 = bank.Account("123");
        Account Account23 = bank.Account("23");
        TaxEmployee taxEmployee = new TaxEmployee();

        Account123.addObserver(taxEmployee);

/*      Account123.deposit(1000);
        Account123.withwdraw(200);
        Account123.transferTo(Account23, 100);*/

        System.out.println("Account123:" + Account123.balance());
        System.out.println("Account23:" + Account23.balance());
        Bankomat bankomat = new Bankomat();
        BankingOperation deposit = new DepositOperation(Account123, 1000);
        bankomat.execute(deposit);
        System.out.println("Account123:" + Account123.balance());
        BankingOperation withwdraw = new WithwdrawOperation(Account123, 200);
        bankomat.execute(withwdraw);
        System.out.println("Account123:" + Account123.balance());
        BankingOperation transferTo = new TransferToOperation(Account123, Account23, 300);
        bankomat.execute(transferTo);
        System.out.println("Account123:" + Account123.balance());
        System.out.println("Account23:" + Account23.balance());

        bankomat.execute(new ChangeInterestOperation(Account123, new InterestA()));
        System.out.println(Account123.getInterest().calculateInterest(Account123));
        bankomat.execute(new ChangeInterestOperation(Account123, new InterestB()));
        System.out.println(Account123.getInterest().calculateInterest(Account123));
    }
}