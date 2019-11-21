package elearning.zpo.lab5;

public class InterestB implements Interest {

    @Override
    public double calculateInterest(Account account) {
        if (account.balance() < 1000) {
            int lowerRate = 3;
            return account.balance() * (lowerRate / 100.0f);
        } else {
            int higherRate = 5;
            return account.balance() * (higherRate / 100.0f);
        }
    }

    @Override
    public String toString() {
        return "Interest B";
    }
}