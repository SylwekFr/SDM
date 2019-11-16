package elearning.zpo.lab5;

public class RateC implements Rate {
    private Account account;

    public RateC() {
    }

    @Override
    public void calculate(Account account) {
        System.out.println("Calculating RateC");
        account.setRate(this);
    }

    @Override
    public String toString() {
        return "C rate";
    }
}
