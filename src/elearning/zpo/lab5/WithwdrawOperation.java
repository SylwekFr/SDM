package elearning.zpo.lab5;

public class WithwdrawOperation implements BankingOperation {
	private Account account;
	private double ammount;
	
	public WithwdrawOperation(Account account, double ammount) {
		super();
		this.account = account;
		this.ammount = ammount;
	}
	@Override
	public void execute() throws BankingException {
		account.withwdraw(ammount);
	}

}
