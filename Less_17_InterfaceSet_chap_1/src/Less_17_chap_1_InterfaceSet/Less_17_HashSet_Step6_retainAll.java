package Less_17_chap_1_InterfaceSet;

import java.util.HashSet;
import java.util.Set;

public class Less_17_HashSet_Step6_retainAll {
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
        Смоделируем пересечение наших SET-ов через retainAll (т.е. в новой коллекции останутся,
        будут содержаться, только одинаковые элементы из обеих коллекций)
        1. Закидываем в set_intersect наш my_int_set_1 через конструктор
        2. Методом *.retainAll добавляем в set_intersect наш my_int_set_2
        */
        Set<Integer> set_intersect = new HashSet<>(my_int_set_1);
        System.out.println("------------------ set_intersect из my_int_set_1 ------------------");
        for (Integer st_prn: set_intersect){
            System.out.print(st_prn + " ");
        }
        System.out.println("\nРазмер set_intersect -> " + set_intersect.size());
        System.out.println("------------------ set_intersect после *.retainAll(my_int_set_2) ------------------");
        set_intersect.retainAll(my_int_set_2);
        for (Integer st_prn: set_intersect){
            System.out.print(st_prn + " ");
        }
        System.out.println("\nРазмер set_intersect -> " + set_intersect.size());
    }
}
