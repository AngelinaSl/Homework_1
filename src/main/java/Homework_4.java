// 1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
// 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
// 3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.
// 4.Отсортировать по возрасту используя дополнительный список индексов.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Homework_4 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        FileReader reader = null;
        String text = "";

        try {
            fileWriter = new FileWriter("hw.sql");
            fileWriter.append("qwerty");
            fileWriter.flush();
            reader = new FileReader("hw.sql");
            while (reader.ready()) {
                text += (char) reader.read();
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(text);


        FileReader reader1 = null;
        String text1 = "";
        try{
            reader1 = new FileReader("data_base.sql");
            while (reader1.ready()) {
                text1 += (char) reader1.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//        System.out.println(text1);

        String[] str1 = text1.split("\n");
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> otchestvo = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < str1.length; i++) {
            String[] tmp = str1[i].split(" ");
            surname.add(tmp[0]);
            name.add(tmp[1]);
            otchestvo.add(tmp[2]);
            age.add(Integer.parseInt(tmp[3]));
            gender.add(tmp[4].equals("жен") ? true:false);
            ll.add(i);
        }

//        for (int i = 0; i < name.size(); i++) {
//            System.out.printf("%d. %s %s.%s. %d %s\n",ll.get(i),surname.get(ll.get(i)),
//                    name.get(ll.get(i)).charAt(0),otchestvo.get(ll.get(i)).charAt(0),
//                    age.get(ll.get(i)),gender.get(ll.get(i)).equals(true) ? "Ж":"М");
//        }

        for (int i = 1; i < age.size() ; i++) {
            int current = ll.get(i);
            int j = i-1;
            while (j >= 0 && age.get(current) < age.get(ll.get(j))){
                ll.set(j+1,ll.get(j));
                j -- ;
            }
            ll.set(j+1,current);
        }
        System.out.println();

        for (int i = 0; i < name.size(); i++) {
            System.out.printf("%d. %s %s.%s. %d %s\n",ll.get(i),surname.get(ll.get(i)),
                    name.get(ll.get(i)).charAt(0),otchestvo.get(ll.get(i)).charAt(0),
                    age.get(ll.get(i)),gender.get(ll.get(i)).equals(true) ? "Ж":"М");
        }
    }
}
