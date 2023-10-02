//Дан текст: в первой строке записано число строк, далее идут сами строки.
// Определите, сколько различных слов содержится в этом тексте.
//
//        Словом считается последовательность непробельных символов идущих подряд, слова разделены одним или
//        большим числом пробелов или символами конца строки.
//
//        Sample Input:
//        4
//        She sells sea shells on the sea shore;
//        The shells that she sells are sea shells I'm sure.
//        So if she sells sea shells on the sea shore,
//        I'm sure that the shells are sea shore shells.
//
//        Sample Output:
//        19

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Task5_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        s = sc.nextLine();
        Set<String> db = new HashSet<>();
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            s = sc.nextLine();
            String[] text = s.split(" ");
            Collections.addAll(db, text);
        }
        System.out.println(db.size());
        System.out.println(db);
    }

}