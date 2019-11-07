package elearning.zpo.lab5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Bank {

    private Map accounts = null;
    
    public Bank() {
        accounts = new HashMap();
    }
    
    /**
     * Creating an account
     * @param id
     * @param owner's name
     * @param owner's surname
     * @throws BankingException
     */
    public void createAccount(String id, String name, String surname) 
    throws BankingException {
        if (Account(id) != null)
            throw new BankingException("This Account ID already exists!");
        Account account = new Account(id, name, surname);
        accounts.put(id, account);
    }
    
    
    /**
     * Searches for Account with a given id number
     * @param id
     * @return
     */
    private Account Account(String id) {
        return (Account) accounts.get(id);
    }
    
    /**
     * Returns an iterator for account list
     * @return
     */
    private Iterator listAccounts() {
        return accounts.values().iterator();
    }
        
    /**
     * Transfer z rachunku na Account
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
        
        Account123.deposit(1000);
        Account123.withwdraw(200);
        Account123.transferTo(Account23, 100);
        
        System.out.println(Account123.balance());
        Bankomat bankomat = new Bankomat();
        BankingOperation deposit = new DepositOperation(Account123, 1000);
        bankomat.setBankingOperation(deposit);
        bankomat.execute();
        System.out.println(Account123.balance());
        
        
        
    }
}