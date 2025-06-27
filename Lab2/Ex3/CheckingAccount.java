public class CheckingAccount extends Account {
    
    private int transactionCount = 0;
    private static final int FREE_TRANSACTIONS = 10;
    private static final double TRANSACTION_FEE = 0.02;

    

    public CheckingAccount(int accountNumber) {
        super(accountNumber);
    }

    
    @Override
    public void deposit(double amount) {
        transactionCount++;
        super.deposit(amount);
    }

    
    @Override
    public void withdraw(double amount) {
        transactionCount++;
        super.withdraw(amount);
    }

    

    public void deductFee() {
        
        int extra = transactionCount - FREE_TRANSACTIONS;
        if (extra > 0) {
            double fee = extra * TRANSACTION_FEE;
            super.withdraw(fee);
        }
        
        transactionCount = 0;
    }

    

    public int getTransactionCount() {
        return transactionCount;
    }


}