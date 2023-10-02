import javax.swing.text.html.parser.Entity;
import java.util.*;

//Пусть дан список сотрудников:
//
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов
//
//        Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности.
public class Task5_2 {
    public static void main(String[] args) {
        String[] lst = {"Иван Иванов",
                        "Светлана Петрова",
                        "Кристина Белова",
                        "Анна Мусина",
                        "Анна Крутова",
                        "Иван Юрин",
                        "Петр Лыков",
                        "Павел Чернов",
                        "Петр Чернышов",
                        "Мария Федорова",
                        "Марина Светлова",
                        "Мария Савина",
                        "Мария Рыкова",
                        "Марина Лугова",
                        "Анна Владимирова",
                        "Иван Мечников",
                        "Петр Петин",
                        "Иван Ежов",};
        Map<String, Integer> names = new HashMap<String, Integer>();
        String[] firstNameLastName = new String[2];
        String firstname = "";
        for (String s : lst) {
            firstNameLastName = s.split(" ");
            firstname = firstNameLastName[0];
            if (names.containsKey(firstname)) {
                int count = names.get(firstname);
                names.put(firstname, count +1);
            }
            else names.put(firstname, 1);
        }
        System.out.println(names);
    }
}
