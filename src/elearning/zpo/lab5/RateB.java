package elearning.zpo.lab5;

public class RateB implements Rate {
    private Account account;
    double interest = 3;

    public RateB() {
    }

    @Override
    public void calculate(Account account) {
        System.out.println("Calculating RateB");
        account.setRate(this);
    }

    @Override
    public String toString() {
        return "B rate";
    }
}
