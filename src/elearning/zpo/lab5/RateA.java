package elearning.zpo.lab5;

public class RateA implements Rate {
    private Account account;
    private double rate = 2;

    RateA(Account account) {
        this.account = account;
    }

    @Override
    public void determineRate() {
        if (account.balance() > 0 && account.balance() < 300) {
            account.setRate(this);
        } else {
            Rate rateB = new RateB(account);
            //account.setRate(rateB);
            rateB.determineRate();
        }
    }

    @Override
    public void calculateInterest(Account account) {
        System.out.println("Calculating RateA " + account.balance() / rate * 100);
    }

    @Override
    public String toString() {
        return "A rate";
    }
}
