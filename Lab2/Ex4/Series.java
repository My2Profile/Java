
public class Series extends Circuit{

	Circuit a, b;
	private double V = 0;
	
	public Series(Circuit a, Circuit b) { this.a = a; this.b = b; }



	public double getResistance() {
		return a.getResistance() + b.getResistance();
	}


	public double getPotentialDiff() {
		return V;
	}


	public void applyPotentialDiff(double volts) {

		this.V = volts;

		double aR = a.getResistance();
		double bR = b.getResistance();



		double I = ( aR + bR == 0 ? 0 : V / (aR + bR));

		a.applyPotentialDiff( I * aR );
		b.applyPotentialDiff( I * bR );


	}



}