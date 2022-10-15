package Less_17_chap_1_InterfaceSet;
/*
Эмуляция разности (или объединения слева) за счет метода removeAll
*/
import java.util.HashSet;
import java.util.Set;

public class Less_17_HashSet_Step7_subTract {
    public static void main(String[] args) {
        Set<Integer> my_int_set_1 = new HashSet<>();
        my_int_set_1.add(1);
        my_int_set_1.add(5);
        my_int_set_1.add(3);
        my_int_set_1.add(9);
        my_int_set_1.add(7);

        Set<Integer> my_int_set_2 = new HashSet<>();
        my_int_set_2.add(4);
        my_int_set_2.add(6);
        my_int_set_2.add(2);
        my_int_set_2.add(9);
        my_int_set_2.add(7);
        /*
        Смоделируем вычетание одно нашего SETa из другого через removeAll
        (т.е. в новой коллекции останутся, элементы которых нет в вычетаемой
        коллекции)
        1. Закидываем в set_sub_tract наш my_int_set_1 через конструктор
        2. Методом *.removeAll добавляем в set_sub_tract наш my_int_set_2
        3. Т.е. классический *.remove() удалит указанный элемент если он есть,
        а если его нет, то и удалять нечего:
        1 - 4 (6,2) - нечего удалять
        5 - 6 (4,2) - нечего удалять
        3 - 2 (6,4) - нечего удалять
        9 - 9       - есть чего удалять
        7 - 7       - есть чего удалять
        итог работы кода по вычетанию (удалению содержимого одного SETa из другого):
        1
        5
        3
        */
        Set<Integer> set_sub_tract = new HashSet<>(my_int_set_1);
        System.out.println("------------------ set_sub_tract из my_int_set_1 ------------------");
        for (Integer st_prn: set_sub_tract){
            System.out.print(st_prn + " ");
        }
        System.out.println("\nРазмер set_sub_tract -> " + set_sub_tract.size());
        System.out.println("------------------ set_sub_tract после *.retainAll(my_int_set_2) ------------------");
        set_sub_tract.removeAll(my_int_set_2);
        for (Integer st_prn: set_sub_tract){
            System.out.print(st_prn + " ");
        }
        System.out.println("\nРазмер set_sub_tract -> " + set_sub_tract.size());
    }
}
