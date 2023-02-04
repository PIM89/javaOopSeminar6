package Model;

/**Класс реализует логику деления двух чисел*/
public class ShareModel extends Model implements ModelInterfaceRes{
    @Override
    public double result(double x, double y) {
        return x / y;
    }
}
