
public abstract class Circuit {


	public abstract double getResistance();
	public abstract double getPotentialDiff();


	public abstract void applyPotentialDiff(double volts);



	public double getPower() {

        double R = getResistance();
		double V = getPotentialDiff();

        if (R == 0) throw new IllegalStateException("Zero resistance – cannot compute power");


        return V * V / R;
    }



	public double getCurrent() { 

		if(getResistance() == 0) throw new IllegalStateException("Zero Resistance! ");

		return (getPotentialDiff() / getResistance());

	}


}