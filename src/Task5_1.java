import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class Task5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> telBook= new HashMap<Integer, String>();
        String fio ="";
        int tel;
        for (int i = 0; i < 5; i++) {
            fio = sc.nextLine();
            System.out.println(fio);
            tel = Integer.parseInt(sc.nextLine());
            System.out.println(tel);
            telBook.put(tel,fio);
        }
        System.out.println(telBook);
    }
}
