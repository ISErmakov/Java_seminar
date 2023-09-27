
//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Task2_3 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        SimpleFormatter sf = new SimpleFormatter();

        FileHandler fh = new FileHandler("file.log");
        fh.setFormatter(sf);

        Logger logger = Logger.getLogger("MyTask3Logger");
        logger.addHandler(fh);
        try {
            System.out.println("Enter n");
            byte n = scan.nextByte();
            System.out.println(n);
        }
        catch (Exception e) {
            logger.log(Level.INFO, e.getMessage());
        }

    }
}