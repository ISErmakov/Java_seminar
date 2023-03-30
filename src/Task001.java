import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {

        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i * i * i;
        }

        Scanner iScaner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = iScaner.nextInt();
        System.out.print("Enter b: ");
        int b = iScaner.nextInt();

        System.out.println(arr[a]);
        System.out.println(arr[b]);
    }
}
