//Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.util.ArrayList;
import java.util.Random;

public class Homework_1 {
    public static void main(String[] args) {

        Random rnd = new Random();
        Integer i = rnd.nextInt(2000);
        System.out.printf("i = %d \n", i);
        int n = Integer.toBinaryString(i).length();
        System.out.printf("n = %d \n", n);

        ArrayList<Integer> m1 = new ArrayList<>();
        int i1 = i;
        while (i1 < Short.MAX_VALUE) {
            if (i1 % n == 0) {
                m1.add(i1);
            }
            i1++;
        }
        System.out.println(m1);

        ArrayList<Integer> m2 = new ArrayList<>();
        int count = 0;
        while (Short.MIN_VALUE < i) {
            if (i % n != 0) {
                m2.add(Short.MIN_VALUE + count);
            }
            i--;
            count++;
        }
        System.out.println(m2);

    }
}
