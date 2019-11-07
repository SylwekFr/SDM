package elearning.zpo.lab5;

public class Bankomat {
	private BankingOperation bankingOperation;

	public void setBankingOperation(BankingOperation bankingOperation) {
		this.bankingOperation = bankingOperation;
	}
	public void execute() throws BankingException {
		bankingOperation.execute();
	}
}
