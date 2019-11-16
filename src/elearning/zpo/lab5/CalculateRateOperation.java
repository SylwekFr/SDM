package elearning.zpo.lab5;

public class CalculateRateOperation implements BankingOperation {
    private Account account;
    private Rate rate;

    public CalculateRateOperation(Account account, Rate rate) {
        this.account = account;
        this.rate = rate;
    }
    @Override
    public void execute() throws BankingException {
        rate.calculate(account);
    }
}
