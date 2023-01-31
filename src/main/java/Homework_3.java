//Создать новый список, добавить несколько строк и вывести коллекцию на экран.
//        Итерация всех элементов списка цветов и добавления к каждому символа '!'.
//        Вставить элемент в список в первой позиции.
//        Извлечь элемент (по указанному индексу) из заданного списка.
//        Обновить определенный элемент списка по заданному индексу.
//        Удалить третий элемент из списка.
//        Поиска элемента в списке по строке.
//        Создать новый список и добавить в него несколько елементов первого списка.
//        Удалить из первого списка все элементы отсутствующие во втором списке.
//        *Сортировка списка.

import java.util.ArrayList;
import java.util.Collections;

public class Homework_3 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Black");
        list.add("Green");
        list.add("Pink");
        list.add("White");
        list.add("Brown");

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "!");
        }

        list.add(0, "Violet");
        System.out.println(list);
        System.out.println(list.get(3));
        list.set(3, "BLACK");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.indexOf("Green"));

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Red");
        l2.add("Pink");
        l2.add("Brown");
        System.out.println(l2);
        list.retainAll(l2);
        System.out.println(list);


        Collections.sort(list);
        System.out.println(list);

    }
}
