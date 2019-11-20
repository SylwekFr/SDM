package elearning.zpo.lab5;

public class InterestC implements Interest {

    @Override
    public double calculateInterest(Account account) {
        double rate = 3.5d;
        return account.balance() * (rate / 100.0f);
    }

    @Override
    public String toString() {
        return "Interest C";
    }
}