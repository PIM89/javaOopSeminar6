package View;

import java.util.Scanner;

/**Класс реализует ввод(вывод) данных*/
public class View {
    Scanner scanner = new Scanner(System.in);

    public double getDouble(String text) {
        System.out.println(text);
        return scanner.nextDouble();
    }

    public void print(double doubleNum) {
        System.out.println("result: " + doubleNum + "\n");
    }

    public void showMenuDouble() {
        System.out.println("Для нахождения суммы чисел выберили -> 1");
        System.out.println("Для нахождения разности чисел выберили -> 2");
        System.out.println("Для нахождения произведения чисел выберили -> 3");
        System.out.println("Для нахождения частного чисел выберили -> 4");
        System.out.println("Для окончания работы программы выбери -> 5");
    }

    public int getChoose() {
        System.out.println("Выбор операции: ");
        return scanner.nextInt();
    }
}
