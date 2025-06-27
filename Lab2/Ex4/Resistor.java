
public class Resistor extends Circuit{
	
	private double ohms;
	private double potentialDiff = 0;


	public Resistor(double ohms) {
		if(ohms < 0 ) throw new IllegalArgumentException("Ohms must be non-negative!");
		this.ohms = ohms;
	}


	public void applyPotentialDiff(double volts) {
		this.potentialDiff = volts;
	}


	public void setPotentialDifference(double diff) { potentialDiff = diff; }


	@Override
	public double getResistance() { return ohms; }


	@Override
	public double getPotentialDiff() { return potentialDiff;  }

}