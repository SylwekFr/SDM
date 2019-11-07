package elearning.zpo.lab5;

public class DepositOperation implements BankingOperation{
	private Account account;
	private double ammount;
	
	public DepositOperation(Account account, double ammount) {
		super();
		this.account = account;
		this.ammount = ammount;
	}
	@Override
	public void execute() throws BankingException {
		account.deposit(ammount);
	}
}
