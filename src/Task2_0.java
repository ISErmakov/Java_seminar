import java.util.Scanner;

/*
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

}
 */
public class Task2_0 {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        System.out.print("Enter jewels: ");
        String jwls = iScaner.next();
        System.out.print("Enter stones: ");
        String stns = iScaner.next();
        System.out.println(findJewelsInStones(jwls, stns));
    }

    public static String findJewelsInStones(String jewels, String stones) {
        String res = "";
        for (int i = 0; i < jewels.length(); i++) {
            int count = 0;
            res = res.concat(String.valueOf(jewels.charAt(i)));
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
            res = res.concat(Integer.toString(count));
        }
        return res;
    }
}
