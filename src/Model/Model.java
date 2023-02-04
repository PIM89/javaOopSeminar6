package Model;

/**Базовый класс*/
public class Model implements ModelInterface {
    double x;
    double y;

    @Override
    public void setX(double value) {
        this.x = value;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public void setY(double value) {
        this.y = value;
    }

    @Override
    public double getY() {
        return this.y;
    }
}
