package Ex2;

public interface Movable {

    void moveUp(int distance);
    void moveDown(int distance);
    void moveLeft(int distance);
    void moveRight(int distance);
    int getX();
    int getY();
    void setPosition(int x, int y);
    
}

interface Planes extends Movable {

    void fly(int altitude);
    int getAltitude();
    void setAltitude(int altitude);
}

interface Cars extends Movable {

    void drive(int speed);
    int getSpeed();
    void setSpeed(int speed);

    
}