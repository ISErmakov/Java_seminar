//Task_3.
//Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner iScanner = new Scanner(System.in);
        int a = iScanner.nextInt();

        System.out.print("Enter operation: ");
        char ch = iScanner.next().charAt(0);

        System.out.print("Enter second number: ");
        int b = iScanner.nextInt();

        int res = 0;

        switch (ch){
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
            case '*':
                res = a * b;
            case '/':
                if (b == 0) System.out.print("division by zero");
                else res = a / b;
                break;
            default:
                System.out.print("wrong operator");
        }

        System.out.printf("Result = %d", res);

    }
}
