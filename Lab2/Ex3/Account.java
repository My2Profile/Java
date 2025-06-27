
public class Account {
	
	protected double balance;
	private int accNumber;
	private int FREE_TRANSACTIONS = 5;

	
	public Account(int a) {	balance = 0.0; accNumber = a;}


	public void deposit(double sum) { balance += sum; }

	public void withdraw(double sum) {
		if(balance>=sum) 
			balance -= sum;
		else { System.out.println("Not enough money to withdraw"); }
	}

	public double getBalance() { return balance; }

	public double getAccountNumber() { return accNumber; }



	public void transfer(double amount, Account other) {
		if(FREE_TRANSACTIONS > 0) {
			other.deposit(amount);
			this.withdraw(amount);
			FREE_TRANSACTIONS--;
		}
		
		else {
			if(this.balance > 0.02 && amount < balance - 0.02) {
				System.out.println("FEE IS TAKEN 0.02$");
				other.deposit(amount);
				this.withdraw(0.02);
				this.withdraw(amount);
			}
		}

	
	}


	public String toString() {
		return "\nAccount#" + this.getAccountNumber() + 
		": " + this.getBalance();
	}



	public final void print() { System.out.println(toString()); }


}