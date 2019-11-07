package elearning.zpo.lab5;

public class TransferToOperation implements BankingOperation {
	private Account accountFrom;
	private Account accountTo;
	private double ammount;
	
	public TransferToOperation(Account accountFrom, Account accountTo, double ammount) {
		super();
		this.accountFrom = accountFrom;
		this.accountTo = accountTo;
		this.ammount = ammount;
	}
	
	@Override
	public void execute() throws BankingException {
		accountFrom.transferTo(accountTo, ammount);

	}

}
