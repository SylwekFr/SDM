package elearning.zpo.lab5;

public class ChangeInterestOperation implements BankingOperation {
    private final Account account;
    private final Interest interest;

    public ChangeInterestOperation(Account account, Interest interest) {
        this.account = account;
        this.interest = interest;
    }


    @Override
    public void execute() throws BankingException {
        this.account.setInterest(interest);
    }
}
