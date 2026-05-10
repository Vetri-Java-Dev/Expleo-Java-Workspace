package BankingTransactionValidation;

class InvalidAccountException extends BankTransactionException {
	
    private String accountId;

    public InvalidAccountException(String accountId) {
        super("Account id cant be empty",1001);
        this.accountId = accountId;
    }
    
}
