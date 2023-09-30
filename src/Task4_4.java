import javax.swing.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task4_4 {
    //Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(1,1,5,4,7));
        // result [6,6,0,1]
        Deque d3 = new ArrayDeque();
        d3 = sum(d1, d2);
        System.out.println(d3);
    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque d3 = new ArrayDeque();

        int j = 0;
        int i = 0;
        while ((d1.peekLast() != null)&&(d2.peekLast() != null)) {
                i = d1.pollLast() + d2.pollLast()+j;
                j = i / 10;
                i = i % 10;
                d3.addFirst(i);
        }
        while (d1.peekLast() != null) {
            i = d1.pollLast() + j;
            j = i / 10;
            i = i % 10;
            d3.addFirst(i);
        }
        while (d2.peekLast() != null) {
            i = d2.pollLast() + j;
            j = i / 10;
            i = i % 10;
            d3.addFirst(i);
        }
        return d3;
    }

}