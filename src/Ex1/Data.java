package Ex1;

public class Data {
	
	private int count;
	private double max, sum;
	
	public Data() {
		count = 0; max = 0.0; sum = 0.0;
	}
	
	public void addValue(double value) {
		count++;
		max = (value>max) ? (value) : (max);
		sum += value;
		
	}
	
	public double getAverage() {
		return (count>0) ? (sum/count) : (0.0);
	}
	
	public double getMax() {
		return (count>0) ? (max) : (0.0);
	}
	
	public int getCount() {return count;}
	
}
