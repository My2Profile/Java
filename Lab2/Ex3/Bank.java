import java.util.Vector;

public class Bank {

	public static void main(String[] args) {
	
		Vector<Account> bank = new Vector<Account>();

		Account acc1 = new SavingsAccount(123);
		Account acc2 = new SavingsAccount(124);

		Account acc3 = new CheckingAccount(234);
		Account acc4 = new CheckingAccount(235);

		bank.add(acc1);
		bank.add(acc2);
		bank.add(acc3);
		bank.add(acc4);



		//Before
		for(Account acc : bank) {
			acc.print();
		}



		for (Account acc : bank) {

			if(acc instanceof SavingsAccount) {
				((SavingsAccount)acc).addInterest();
			}
			else if(acc instanceof CheckingAccount) {
				((CheckingAccount)acc).deductFee();
			}

		}



		
		//After
		for(Account acc : bank) {
			acc.print();
		}

	}

}