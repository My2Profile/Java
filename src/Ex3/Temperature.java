package Ex3;

public class Temperature {
	
	private float value;
	private char scale;
	
	public Temperature() {
		this.scale = 'C';
		this.value = 0;
	}
	
	public Temperature(float value) {
		this.scale = 'C';
		this.value = value;
	}
	
	public Temperature(char scale) {
		this.scale = scale;
		this.value = 0;
	}
	
	public Temperature(float value, char scale) {
		this.scale = scale;
		this.value = value;
	}
	
	
	
	public char getScale() {return this.scale;}
	
	public void setScale(char scale) {this.scale = scale;}
	
	public void setValue(float value) {this.value = value;}
	
	public void setBoth(float value, char scale) {this.value = value;  this.scale = scale;}
	
	
	public static float toCelcius(float F) {	return (5 * ((F-32)/9 ) );	}
	
	public static float toFarenheit(float C) {	return (9 * (C/5)) + 32;	}
	
	
	@Override
	public String toString() {
		return "Value: " + this.value + "\nScale: " + this.scale + "\n";
	}
	
}
