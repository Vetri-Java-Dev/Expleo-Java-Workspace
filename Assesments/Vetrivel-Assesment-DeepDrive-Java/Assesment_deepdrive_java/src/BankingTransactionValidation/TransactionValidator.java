package BankingTransactionValidation;

class TransactionValidator {

    public static void validateTransaction(String accountId, double balance,
           double amount, double dailyLimit)throws BankTransactionException {

        if(accountId==null||accountId.isEmpty())
            throw new InvalidAccountException(accountId);

        if(amount>balance){
            double shortfall=amount-balance;
            throw new InsufficientFundsException(shortfall);
        }

        if(amount>dailyLimit) {
            throw new TransactionLimitException(dailyLimit);
        }

        System.out.println("Transaction is valid.");
    }
}