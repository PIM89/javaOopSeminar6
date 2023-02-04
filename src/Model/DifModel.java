package Model;

/**Класс реализует логику вычисления разницы двух чисел*/
public class DifModel extends Model implements ModelInterfaceRes {
    @Override
    public double result(double x, double y) {
        return x - y;
    }
}