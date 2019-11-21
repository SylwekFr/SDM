
package elearning.zpo.lab5;

import java.util.Observable;

class Account extends Observable {

    private final String id;
    private final String name;
    private final String surname;
    private double balance = 0;

    public void setInterest(Interest interest) {
        this.interest = interest;
    }

    private Interest interest;

    public double calculateInterest() {
        return interest.calculateInterest(this);
    }


    public Account(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    /**
     * Deposit funds to Account
     *
     * @param ammount
     * @throws BankingException
     */
    public void deposit(double ammount)
            throws BankingException {
        if (ammount < 0)
            throw new BankingException("ammount should be positive");

        this.balance += ammount;
        setChanged();
        notifyObservers(this.name);
    }

    /**
     * Withwdraw from account
     *
     * @param amount
     * @throws BankingException
     */
    public void withwdraw(double amount)
            throws BankingException {
        if (this.balance < amount)
            throw new BankingException("you have a too low balance on your account");
        if (amount < 0)
            throw new BankingException("ammount should be positive");

        this.balance -= amount;
        setChanged();
        notifyObservers(this.name);
    }

    /**
     * amount of funds available
     *
     * @return
     */
    public double balance() {
        return this.balance;
    }

    private String owner() {
        return this.name + " " + this.surname;
    }

    /**
     * Requesting a transfer to another account
     *
     * @param Account
     * @param ammount
     * @throws BankingException
     */
    public void transferTo(Account Account, double ammount)
            throws BankingException {
        if (ammount > balance)
            throw new BankingException("Trying to transfer more funds than available");

        balance -= ammount;
        Account.transferFrom(this, ammount);
        setChanged();
        notifyObservers(this.name);
    }

    /**
     * Accepting a transfer from another account
     *
     * @param account
     * @param ammount
     */
    private void transferFrom(Account account, double ammount) {
        balance += ammount;
        setChanged();
        notifyObservers(this.name);
    }

    /**
     * Account description
     */
    public String toString() {
        return "Nr: " + id + ", owner: " + owner() + ", balance: " + balance();
    }
}
