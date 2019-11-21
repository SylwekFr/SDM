package elearning.zpo.lab5;

public class InterestA implements Interest {

    @Override
    public double calculateInterest(Account account) {
        if (account.balance() < 800) {
            int lowerRate = 2;
            return account.balance() * (lowerRate / 100.0f);
        } else {
            int higherRate = 4;
            return account.balance() * (higherRate / 100.0f);
        }
    }

    @Override
    public String toString() {
        return "Interest A";
    }
}