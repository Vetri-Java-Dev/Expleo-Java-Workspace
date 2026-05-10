package BankingTransactionValidation;

class TransactionLimitException extends BankTransactionException {
	
    private double limit;

    public TransactionLimitException(double limit) {
        super("Limit : "+limit,1003);
        this.limit=limit;
    }
    
}