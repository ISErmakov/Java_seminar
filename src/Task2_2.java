import java.util.Scanner;

/*
Task_2

На первой строке записывается натуральное число n - количество строчек в книге.
Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов,
 на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2",
 где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1.
Гарантируется что любой продукт состоит из 1 слова.
название продуктов написаны строчными буквами.
Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран.
На окончания не обращайте внимание.
ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

Sample Input:

2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.

3
арахис - колбаса
клубника - вишня
сгущенка - молоко

Sample Output:

Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.
 */
public class Task2_2 {
    public static void main(String[] args){
        Scanner iScaner = new Scanner(System.in);
        System.out.println("Введите количество строк в книге: ");
        int bookStringsCount = iScaner.nextInt();

        System.out.println("Введите строки в книге: ");
        String[] bookStrings = new String[bookStringsCount];
        iScaner.nextLine();
        for (int i = 0; i < bookStringsCount; i++) {
            String bookString = iScaner.nextLine();
            bookStrings[i] = bookString;
        }

        System.out.println("Введите количество замен");
        int changeProductCount = iScaner.nextInt();

        System.out.println("Введите замены");
        String[] Products = new String[2 * changeProductCount];
        String[] changeProducts = new String[2 * changeProductCount];
        iScaner.nextLine();
        for (int i = 0; i < changeProductCount; i++) {
            String changeProduct = iScaner.nextLine();
            String[] parts = changeProduct.split(" - ");
            Products[i] = parts[0];
            changeProducts[i] = parts[1];
            Products[i + changeProductCount] = Products[i].replaceFirst(String.valueOf(Products[i].charAt(0)), String.valueOf(Character.toUpperCase(Products[i].charAt(0))));
            changeProducts[i + changeProductCount] = changeProducts[i].replaceFirst(String.valueOf(changeProducts[i].charAt(0)), String.valueOf(Character.toUpperCase(changeProducts[i].charAt(0))));
        }

        for (int i = 0; i < bookStringsCount; i++) {
            System.out.println(changeString(bookStrings[i], Products, changeProducts));
        }
    }
    public static String changeString(String bookString, String[] Products, String[] changeProducts){
        for (int i = 0; i < Products.length; i++) {
            bookString = bookString.replace(Products[i], changeProducts[i]);
        }
        return bookString;
    }
}
