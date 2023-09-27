import java.util.*;

/*
* Task_1
public class Task_1 {

// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

}*/
public class Task2_1 {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = iScaner.nextLine();
        int[] index = new int[str.length()];
        for (int i = 0; i < index.length; i++) {
            index[i] = i;
        }
        Random r = new Random();
        for (int i = 0; i < index.length; i++) {
            int randomIndex  = r.nextInt(i + 1);
            int a = index[randomIndex];
            index[randomIndex] = index[i];
            index[i] = a;
        }

        for (int i: index) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(shuffle(str, index));
    }

    public static String shuffle(final String s, final int[] index){
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < index.length; j++) {
                if (index[j] == i) {
                    res = res + s.charAt(j);
                }
            }
        }
        return res;
    }
}
