package elearning.zpo.lab5;

public class SetRateOperation implements BankingOperation {
    private Account account;
    private InterestRate interestRate;

    public SetRateOperation(Account account, InterestRate interestRate) {
        super();
        this.account = account;
        this.interestRate = interestRate;
    }

    @Override
    public void execute() throws BankingException {
        interestRate.setRate(account, interestRate);
        account.printInterestState();
    }
}
