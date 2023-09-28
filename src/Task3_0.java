import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task3_0 {
    public static void main(String[] args) {

        Random r = new Random();
        int n = r.nextInt(100);

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(r.nextInt(n));
        }
        System.out.println(list);
        //System.out.println(SortByMerge(list));
        System.out.println(SortBySelection(list));
    }

    public static List SortByMerge(List list){
        if (list.size() > 1){
            int mid = list.size() / 2;
            List left;
            List right;
            left = SortByMerge(list.subList(0, mid));
            List left1 = List.copyOf(left);
            right = SortByMerge(list.subList(mid, list.size()));
            List right1 = List.copyOf(right);
            int i = 0, j = 0, k = 0;
            while ((i < left1.size()) && (j < right1.size())){
                if ((int) left1.get(i) < (int) right1.get(j)){
                    list.set(k, left1.get(i));
                    i++;
                }
                else {
                    list.set(k, right1.get(j));
                    j++;
                }
                k++;
            }
            while (i < left1.size()) {
                list.set(k,left1.get(i));
                i++;
                k++;
            }
            while (j < right1.size()) {
                list.set(k,right1.get(j));
                j++;
                k++;
            }
        }
        return list;
    }

    public static List SortBySelection(List list){
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            int min = (int)list.get(i);
            int min_index = i;
            for (int j = i; j < list.size(); j++) {
                if ((int)list.get(j) < min) {
                    min = (int)list.get(j);
                    min_index = j;
                }
            }
        temp = (int)list.get(i);
        list.set(i,min);
        list.set(min_index,temp);
        }
        return list;
    }
}
