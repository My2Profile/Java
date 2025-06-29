package Ex2;

public class Car implements Cars {
    
    private int x;
    private int y;
    private int speed;

    @Override
    public void moveUp(int distance) {
        y += distance;
    }

    @Override
    public void moveDown(int distance) {
        y -= distance;
    }

    @Override
    public void moveLeft(int distance) {
        x -= distance;
    }

    @Override
    public void moveRight(int distance) {
        x += distance;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void drive(int speed) {
        this.speed = speed;
        System.out.println("Driving at speed: " + speed);
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}