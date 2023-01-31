
import static java.lang.Long.reverse;

public class Homework_2 {
    public static String reverse(String s4) {
        if (s4.length() == 1) return s4;
        return s4.charAt(s4.length() - 1) + reverse(s4.substring(0, s4.length() - 1));
    }

    public static void main(String[] args) {

        //Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

        String str = "Hello, Java!!!";
        String mystr = "Ja";
        int t = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == mystr.charAt(t)){
                if (str.charAt(i + mystr.length() - 1) == mystr.charAt(mystr.length() - 1)){
                    t = i;
                    break;
                }
            }
        }
        if (str.contains(mystr) == false){
            System.out.println("Второй строки нет в первой строке\n");
        }
        else {
            System.out.printf("Вторая строка входит в первую с %d индекса\n", t);
        }



        //Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

        String string1 = "ABDC";
        String string2 = "BDCA";

        if ((string1.length() == string2.length()) && ((string1 + string1).indexOf(string2) != -1))
            System.out.println("Две строки являются вращением друг друга\n");
        else
            System.out.println("Две строки не являются вращением друг друга\n");



        //*Напишите программу, чтобы перевернуть строку с помощью рекурсии.

        String s3 = "Hello, Java!";
        System.out.println(reverse(s3));

// Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
// Используем метод StringBuilder.append().

        int x = 3;
        int y = 56;

        StringBuilder sum = new StringBuilder();
        sum.append(x + " + " + y + " = " + (x + y));
        System.out.println(sum);

        StringBuilder diff = new StringBuilder();
        diff.append(x + " - " + y + " = " + (x - y));
        System.out.println(diff);

        StringBuilder mult = new StringBuilder();
        mult.append(x + " * " + y + " = " + (x * y));
        System.out.println(mult);

        StringBuilder div = new StringBuilder();
        div.append(x + " / " + y + " = " + (x / y));
        System.out.println(div);

         //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().


        sum.insert(8, "равно");
        sum.deleteCharAt(7);
        System.out.println(sum);


        //*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

        diff.replace(7,8, "равно");
        System.out.println(diff);

        //**Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.


        String str5 = "";

        for (int i = 0; i < 10000; i++) {
            str += "=";
        }
        long begin1 = System.currentTimeMillis();
        System.out.println(str5.replaceAll("=", "равно"));
        long end1 = System.currentTimeMillis();
        System.out.println("Время String: " + (end1 - begin1));

        StringBuilder str_b = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            str_b.append("=");
        }
        long begin2 = System.currentTimeMillis();
        int i = 0;
        int j = 1;
        String s2 = "равно";
        while (i < (10000*s2.length())) {
            str_b.replace(i, j, s2);
            i = i + s2.length();
            j = j + s2.length();
        }
        long end2 = System.currentTimeMillis();

        System.out.println("Время StringBuilder: " + (end2 - begin2));
        System.out.println("Разница: " + ((end1 - begin1) - (end2 - begin2)));


    }
}

