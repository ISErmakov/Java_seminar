import java.util.*;

public class Homework6 {
    public static List<Notebook> notes = new ArrayList<>();
    public static void main(String[] args) {
        // Создаем множество ноутбуков
        Random rn = new Random();
        int notesCount = rn.nextInt(50);
        for (int i = 0; i < notesCount; i++) {
            notes.add(new Notebook());
            System.out.println(notes.get(i));
        }

        //Создаем коллекцию фильтров
        Map<Integer, String> filterMap = new HashMap<>();
        filterMap.put(1,"ОЗУ");
        filterMap.put(2,"Объем ЖД");
        filterMap.put(3,"Операционная система");
        filterMap.put(4,"Цвет");


        Scanner sc = new Scanner(System.in);
        int filterSelected = 0;
        int filterParametr = 0;
        while (true) {
            System.out.println("Select filter:");
            System.out.println(filterMap);
            filterSelected = sc.nextInt();
            System.out.println("Enter min filter parametr:");
            filterParametr = sc.nextInt();
            printFilteredNotebooks(filterSelected, filterParametr);
        }
    }

    private static void printFilteredNotebooks(int filterSelected, int filterParametr) {

            switch (filterSelected){
                case 1 :
                    for (Notebook notebook : notes) {
                        if (notebook.ramMemory >= filterParametr) System.out.println(notebook);
                    }
                    break;
                case 2:
                    for (Notebook note : notes) {
                        if (note.storageMemory >= filterParametr) System.out.println(note);
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("No such filter");

            }
    }
}
