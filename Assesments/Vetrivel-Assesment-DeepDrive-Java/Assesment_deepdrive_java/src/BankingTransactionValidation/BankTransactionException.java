package BankingTransactionValidation;

abstract class BankTransactionException extends Exception {
	
    private int errorCode;

    public BankTransactionException(String message, int errorCode) {
        super(message);
        this.errorCode=errorCode;
    }

	public int getErrorCode() {
        return errorCode;
    }
}