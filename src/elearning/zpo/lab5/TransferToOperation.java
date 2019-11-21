package elearning.zpo.lab5;

public class TransferToOperation implements BankingOperation {
	private final Account accountFrom;
	private final Account accountTo;
	private final double ammount;
	
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
