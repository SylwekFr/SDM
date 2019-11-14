package elearning.zpo.lab5;

public interface InterestRate {
    void setRate(Account account, InterestRate interestRate);

    void printInterestState(Account account);
}
