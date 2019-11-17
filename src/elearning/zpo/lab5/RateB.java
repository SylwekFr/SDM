package elearning.zpo.lab5;

public class RateB implements Rate {
    private Account account;
    private double rate = 3;

    RateB(Account account) {
        this.account = account;
    }

    @Override
    public void determineRate() {
        if (account.balance() >= 300 && account.balance() < 500) {
            account.setRate(this);
        } else {
            Rate rateC = new RateC(account);
            //account.setRate(rateC);
            rateC.determineRate();
        }
    }

    @Override
    public void calculateInterest(Account account) {
        System.out.println("Calculating RateB " + account.balance() / rate * 100);
    }

    @Override
    public String toString() {
        return "B rate";
    }
}
