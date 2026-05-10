package BankingTransactionValidation;

class InsufficientFundsException extends BankTransactionException {
	
    private double shortfall;

    public InsufficientFundsException(double shortfall) {
        super("Shortfall : "+shortfall,1002);
        this.shortfall = shortfall;
    }
    
}
