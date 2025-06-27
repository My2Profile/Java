public class Test {
	
	public static void main(String[] args) {
		
		Cylinder cylinder = new Cylinder(10, 20);
		
		Cube cube = new Cube(5);
		
		Sphere sphere = new Sphere(7);

		System.out.println("Cylinder Volume: " + cylinder.toString());

		System.out.println("Cube Volume: " + cube.toString());

		System.out.println("Sphere Volume: " + sphere.toString());

	}

}