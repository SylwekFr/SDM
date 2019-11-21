package elearning.zpo.lab5;

public class WithwdrawOperation implements BankingOperation {
	private final Account account;
	private final double ammount;
	
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
