import java.util.ArrayDeque;
import java.util.Deque;

public class Task4_5 {

//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

    public static void main(String[] args) {
        String s = ")()(";
//        int j = 0;
//        for (int i = 0; i < s.length() ; i++) {
//            switch (s.charAt(i)) {
//                case '(': j++; break;
//                case ')': j--; break;
//                case '[': j++; break;
//                case ']': j--; break;
//                case '{': j++; break;
//                case '}': j--; break;
//            }
//        }

        System.out.println(validate(s));
        //System.out.println((j == 0) ? "true" : "false");

    }
    public static boolean validate(String s){
        Deque<Character> dq = new ArrayDeque();
        char f;
        for (int i = 0; i < s.length(); i++) {
            f = s.charAt(i);
            if ((f == '(')||(f=='[')||(f=='{')){
                dq.add(f);
            } else if ((f==')')&&(!dq.isEmpty())) {
                if (dq.pollLast() != '(') return false;
            } else if ((f==']')&&(!dq.isEmpty()))  {
                if (dq.pollLast() != '[') return false;
            } else if ((f=='}')&&(!dq.isEmpty())) {
                if (dq.pollLast() != '{') return false;
            } else return false;
        }
        return true;

//        char f;
//        char g;
//        while ((deque.peekFirst() != null) && (deque.size() > 1)){
//            f = deque.pollFirst();
//            g = deque.pollLast();
//            if ((f == '(')||(f=='[')||(f=='{')) {
//                if ((f == '(') &&(g != ')')) return false;
//                if ((f == '[') &&(g != ']')) return false;
//                if ((f == '{') &&(g != '}')) return false;
//            }
//            else return false;
//        }
//        return true;
    }

}