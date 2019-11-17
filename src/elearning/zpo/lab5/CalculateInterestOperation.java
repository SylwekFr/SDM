package elearning.zpo.lab5;

public class CalculateInterestOperation implements BankingOperation {
    private Account account;
    private Rate rate;

    public CalculateInterestOperation(Account account) {
        this.account = account;
    }


    @Override
    public void execute() throws BankingException {
        rate = new RateA(account);
        rate.determineRate();
        account.calculateInterest();
    }
}
