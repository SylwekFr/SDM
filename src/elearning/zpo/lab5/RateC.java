package elearning.zpo.lab5;

public class RateC implements Rate {
    private Account account;
    private double rate = 4;

    RateC(Account account) {
        this.account = account;
    }

    @Override
    public void determineRate() {
        if (account.balance() >= 500) {
            account.setRate(this);
        } else {
            Rate rateA = new RateA(account);
            //account.setRate(rateA);
            rateA.determineRate();
        }
    }

    @Override
    public void calculateInterest(Account account) {
        System.out.println("Calculating RateC " + account.balance() / rate * 100);
        //account.setRate(this);
    }

    @Override
    public String toString() {
        return "C rate";
    }
}
