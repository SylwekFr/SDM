

package elearning.zpo.lab5;


class BankingException extends Exception {
    private static final long serialVersionUID = 1L;

    public BankingException() {
        super();
    }
    
    public BankingException(String message) {
        super(message);
    }
    
    public BankingException(Throwable exception) {
        super(exception);
    }
}
