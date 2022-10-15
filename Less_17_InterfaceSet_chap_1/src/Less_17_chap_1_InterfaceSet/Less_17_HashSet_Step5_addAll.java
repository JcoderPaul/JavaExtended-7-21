package Less_17_chap_1_InterfaceSet;

import java.util.HashSet;
import java.util.Set;

public class Less_17_HashSet_Step5_addAll {
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
        Смоделируем объединение наших SET-ов через addAll
        1. Закидываем в set_union наш my_int_set_1 через конструктор
        2. Методом *.addAll добавляем в set_union наш my_int_set_2
        3. Т.к. SET не дозволяет дублирование элементов получаем пересечение коллекций
        */
        Set<Integer> set_union = new HashSet<>(my_int_set_1);
        System.out.println("------------------ set_union из my_int_set_1 ------------------");
        for (Integer st_prn: set_union){
            System.out.print(st_prn + " ");
        }
        System.out.println("\nРазмер set_union -> " + set_union.size());
        System.out.println("------------------ set_union после *.addAll(my_int_set_2) ------------------");
        set_union.addAll(my_int_set_2);
        for (Integer st_prn: set_union){
            System.out.print(st_prn + " ");
        }
        System.out.println("\nРазмер set_union -> " + set_union.size());
    }
}
