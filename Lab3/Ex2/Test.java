package Ex2;

public class Test {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.setPosition(0, 0);
        plane.fly(10000);
        plane.moveUp(500);
        System.out.println("Plane position: (" + plane.getX() + ", " + plane.getY() + ") at altitude " + plane.getAltitude());

        Car car = new Car();
        car.setPosition(10, 20);
        car.drive(60);
        car.moveRight(10);
        System.out.println("Car position: (" + car.getX() + ", " + car.getY() + ") at speed " + car.getSpeed());
    }
}
