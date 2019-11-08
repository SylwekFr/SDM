
package elearning.zpo.lab5;

public class Account {

    private String id = null;
    private String name = null;
    private String surname = null;
    private double balance = 0; 
    
    public Account(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
            
    /**
     * Deposit funds to Account
     * @param ammount
     * @throws BankingException
     */
    public void deposit(double ammount) 
    throws BankingException {
        if (ammount < 0)
            throw new BankingException("ammount should be positive");
        
        this.balance += ammount;
    }
    
    /**
     * Withwdraw from account
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
    }
        
    /**
     * amount of funds available
     * @return
     */
    public double balance() {
        return this.balance;
    }
    
    public String owner() {
    	return this.name + " " + this.surname;
    }
    
    /**
     * Requesting a transfer to another account
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
    }
    
    /**
     * Accepting a transfer from another account
     * @param account
     * @param ammount
     */
    private void transferFrom(Account account, double ammount) {
        balance += ammount;
    }

    /**
     * Account description
     */
    public String toString() {
        return "Nr: " + id + ", owner: " + owner() + ", balance: " + balance();
    } 
}
