package Ex2;

public class Plane implements Planes {
    private int x;
    private int y;
    private int altitude;

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
    public void fly(int altitude) {
        this.altitude = altitude;
        System.out.println("Flying at altitude: " + altitude);
    }

    @Override
    public int getAltitude() {
        return altitude;
    }

    @Override
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
    
}
