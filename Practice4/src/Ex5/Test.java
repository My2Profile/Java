package Ex5;

public class Test implements SellableAndPluggable{

	@Override
	public void sellable() {
		System.out.println("Sellable method");
	}

	@Override
	public void pluggable() {
		System.out.println("Pluggable method");
	}

	@Override
	public void SellableAndPlubabble() {
		System.out.println("SellableAndPlugabble method");
	}
	
	public static void main(String[] args) {
		
		Test test = new Test();
		
		test.sellable();
		test.pluggable();
		test.SellableAndPlubabble();

	}

	
}
