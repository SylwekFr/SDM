package elearning.zpo.lab5;

public class RateA implements Rate {
    private Account account;
    double interest = 2;

    public RateA() {
    }

    @Override
    public void calculate(Account account) {
        System.out.println("Calculating RateA");
        account.setRate(this);
    }

    @Override
    public String toString() {
        return "A rate";
    }
}
