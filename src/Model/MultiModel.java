package Model;

/**Класс реализует логику перемножения двух чисел*/
public class MultiModel extends Model implements ModelInterfaceRes{
    @Override
    public double result(double x, double y) {
        return x * y;
    }
}
