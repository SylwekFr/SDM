package elearning.zpo.lab5;

public class RateA implements InterestRate {
    private int persents = 2;

    @Override
    public void setRate(Account account, InterestRate interestRate) {
        account.setInterestRate(interestRate);
    }

    @Override
    public void printInterestState(Account account) {

        System.out.println("Interest for RateA:" + persents / account.balance() * 100);
    }
}
