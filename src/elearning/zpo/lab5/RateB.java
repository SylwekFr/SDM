package elearning.zpo.lab5;

public class RateB implements InterestRate {
    private int persents = 5;

    @Override
    public void setRate(Account account, InterestRate interestRate) {
        account.setInterestRate(interestRate);
    }

    @Override
    public void printInterestState(Account account) {
        System.out.println("Interest for RateB:" + persents / account.balance() * 100);
    }
}
