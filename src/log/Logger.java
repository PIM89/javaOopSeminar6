package log;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**Класс реализует логирование*/
public class Logger implements LogInterface {
    /**Метод реализует запись в файл данных о
     * 1. времени операции
     * 2. наименование самой операции
     * 3. числах, учавствующих в операции
     * 4. результата вычисления*/
    @Override
    public void recLog(double x, double y, int operation, double res) {
        Map<Integer, String> oper = new HashMap<>();
        oper.put(1, "сумма чисел");
        oper.put(2, "разность чисел");
        oper.put(3, "произведение чисел");
        oper.put(4, "деление чисел");

        Date date = new Date();
        File file = new File("log.txt");
        String text = "Время опрерации: " + date + ", операция: " +
                oper.get(operation) + ", первое число: " +
                x + ", второе число: " + y + ", результат: " + res + "\n";
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
