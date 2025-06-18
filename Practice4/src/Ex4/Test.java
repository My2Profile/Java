package Ex4;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		App app = new App();
		
		app.getStatistics(new LogicGame());
		
		app.getStatistics(new MemoryGame());

	}

}
