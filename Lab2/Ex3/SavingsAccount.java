public class SavingsAccount extends Account {

	double interestRate = 17;

	public SavingsAccount(int accNumber) {
		super(accNumber);
	}


	public void addInterest() {
		double interest = balance * (interestRate / 100);
		balance += interest;
	}

	
}