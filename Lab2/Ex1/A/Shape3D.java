public abstract class Shape3D {
	
	public abstract double volume();

	public abstract double surfaceArea();

	public abstract String toString();

}

class Cylinder extends Shape3D{

	private double radius, height;

	public Cylinder(double r, double h) {
		this.radius = r;
		this.height = h;
	}


	@Override
	public double volume() {
		return Math.PI * radius * radius * height;
	}

	public double surfaceArea() {
		return (2 * radius * height) + (2 * Math.PI * radius * radius);
	}

	public String toString() {
		return "\nCylinder" + " Volume: " + volume() + " Surface Area: " + surfaceArea()
				+ " Radius: " + radius + " Height: " + height; }

}


class Cube extends Shape3D {

	private double a;

	public Cube(double a) { this.a = a; }


	@Override
	public double volume() { return Math.pow(this.a, 3); }


	@Override
	public double surfaceArea() { return 6 * this.a * this.a; }

	@Override
	public String toString() { return "\nCube" + " Volume: " + volume() + " Surface Area: " + surfaceArea()
				+ " Side Length: " + a; };

}



class Sphere extends Shape3D {

	double radius;

	public Sphere(double radius) { this.radius = radius; }


	@Override
	public double volume() { return (4/3) * Math.PI * Math.pow(this.radius, 3); }


	@Override
	public double surfaceArea() { return 4 * Math.PI * this.radius * this.radius; }


	@Override
	public String toString() { return "\nSphere" + " Volume: " + volume() + " Surface Area: " + surfaceArea() + " Radius: " + radius; }

}

