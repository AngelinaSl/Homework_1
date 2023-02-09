//Создать словарь HashMap. Обобщение <Integer, String>.
//        Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
//        Изменить значения дописав восклицательные знаки.
//        *Создать TreeMap, заполнить аналогично.
//        *Увеличить количество элементов до 1000 случайными ключами и общей строкой.
//        **Сравнить время последовательного и случайного перебора тысячи элементов словарей.

import java.util.*;

public class Homework_5 {

    public static void main(String[] args) {

        HashMap<Integer, String> colors = new HashMap<>();

        colors.putIfAbsent(1, "red");
        colors.putIfAbsent(2, "blue");
        colors.putIfAbsent(3, "green");
        System.out.println(colors);

        colors.put(1, "red!");
        colors.put(2, "blue!");
        colors.put(3, "green!");
        System.out.println(colors);

        TreeMap<Integer, String> treeMap_colors = new TreeMap<>();

        treeMap_colors.putIfAbsent(01, "red");
        treeMap_colors.putIfAbsent(02, "blue");
        treeMap_colors.putIfAbsent(03, "green");
        System.out.println(treeMap_colors);

        treeMap_colors.put(01, "red!");
        treeMap_colors.put(02, "blue!");
        treeMap_colors.put(03, "green!");
        System.out.println(treeMap_colors);


        for (int i = 0; i < 1000000; i++) {
            colors.put(new Random().nextInt(Short.MAX_VALUE), "");
            treeMap_colors.put(new Random().nextInt(Short.MAX_VALUE), "");
        }

        HashMap<Integer, String> colors_1 = new HashMap<>();
        TreeMap<Integer, String> treeMap_colors_1 = new TreeMap<>();


        for (int j = 0; j < 1000000; j++) {
            colors_1.put(j, "");
            treeMap_colors_1.put(j, "");
        }



        long start_random_HashMap = System.currentTimeMillis();
        Iterator <Integer> iterator = colors.keySet().iterator();
        while (iterator.hasNext()) {
            String val = colors.get(iterator.next());
        }
        long end_random_HashMap = System.currentTimeMillis();
        System.out.printf("Время случайного перебора HashMap: %d\n", end_random_HashMap-start_random_HashMap);



        long start_random_TreeMap = System.currentTimeMillis();
        Iterator <Integer> iterator1 = colors.keySet().iterator();
        while (iterator1.hasNext()) {
            String val = treeMap_colors.get(iterator1.next());
        }
        long end_random_TreeMap = System.currentTimeMillis();
        System.out.printf("Время случайного перебора TreeMap: %d\n",end_random_TreeMap-start_random_TreeMap);



        long start_sequences_HashMap = System.currentTimeMillis();
        Iterator <Integer> iterator2 = colors.keySet().iterator();
        while (iterator2.hasNext()) {
            String val = colors_1.get(iterator2.next());
        }
        long end_sequences_HashMap = System.currentTimeMillis();
        System.out.printf("Время последовательного перебора HashMap: %d\n", end_sequences_HashMap-start_sequences_HashMap);



        long start_sequences_TreeMap = System.currentTimeMillis();
        Iterator <Integer> iterator3 = colors.keySet().iterator();
        while (iterator3.hasNext()) {
            String val = treeMap_colors_1.get(iterator3.next());
        }
        long end_sequences_TreeMap = System.currentTimeMillis();
        System.out.printf("Время последовательного перебора HashMap: %d\n",end_sequences_TreeMap-start_sequences_TreeMap);

    }
// Неудачная попытка обернуть все в метод:
//    public static long time_TreeMap(TreeMap treemap){
//        long start_random_TreeMap = System.currentTimeMillis();
//        Iterator <Integer> iterator1 = treemap.keySet().iterator(); //через map.values().iterator() - вывод значений
//        while (iterator1.hasNext()) {
//            String val = treemap.get(iterator1.next());
//        }
//        long end_random_TreeMap = System.currentTimeMillis();
//        long time = (end_random_TreeMap - start_random_TreeMap);
//        return time;
//    }
//
//    public static long time_HashMap(HashMap hashMap){
//        long start_random_hashMap = System.currentTimeMillis();
//        Iterator <Integer> iterator1 = hashMap.keySet().iterator(); //через map.values().iterator() - вывод значений
//        while (iterator1.hasNext()) {
//            String val = hashMap.get(iterator1.next());
//        }
//        long end_random_hashMap = System.currentTimeMillis();
//        long time = (end_random_hashMap - start_random_hashMap);
//        return time;
//    }

}
