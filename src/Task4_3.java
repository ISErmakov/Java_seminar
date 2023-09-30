import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task4_3 {
    // Дан Deque состоящий из последовательности цифр.
    // Необходимо проверить, что последовательность цифр является палиндромом
    public static boolean checkOn(Deque<Integer> deque) {
        while ((deque.peekFirst() != null)&&(deque.size() > 1)) {
            if (deque.pollFirst() != deque.pollLast()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(6, 5, 4, 5, 4, 5, 6));
        System.out.println(checkOn(deque));
    }
}