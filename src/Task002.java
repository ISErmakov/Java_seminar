/**Вводится число n, затем n чисел целых, по одному на каждой строке.
 * Затем вводится число, на которое нужно умножить все введённые выше числа.
 * Выведите на экран результат умножения построчно.
        Sample Input:
        4
        1
        2
        3
        5
        2
        Sample Output:

        2
        4
        6
        10
 */

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = iScaner.nextInt();

        System.out.println("Enter array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = iScaner.nextInt();
        }

        System.out.print("Enter multiply: ");
        int m = iScaner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] * m);
        }

    }
}
