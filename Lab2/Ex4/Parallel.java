
public class Parallel extends Circuit {

	private double V = 0;
	Circuit a, b;

	public Parallel(Circuit a, Circuit b) {this.a = a; this.b = b; }


	public double getPotentialDiff() { return V; }



	public void applyPotentialDiff(double V) {
		this.V = V;

		a.applyPotentialDiff(V);
		b.applyPotentialDiff(V);

	}



	public double getResistance() {
		if(a.getResistance() == 0 || b.getResistance() == 0) return 0;

		double sum = (1/a.getResistance()) + (1/b.getResistance()) ;

		return (sum == 0 ? 0 : 1/sum);
	}

}