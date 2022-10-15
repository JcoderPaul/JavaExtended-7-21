package Less_17_chap_2_TreeSet;
/*
Напоминалка по TreeSet.
Смотрим, как работают стандартные методы.
*/
import java.util.*;

/*
TreeSet, как и TreeMap не хранит NULL!!!
*/
public class Less_17_TreeSet_Step2 {
    public static void main(String[] args) {
        Set<Integer> my_tree_set = new TreeSet<>();
        // Добавили в разнобой
        my_tree_set.add(3);
        my_tree_set.add(8);
        my_tree_set.add(12);
        my_tree_set.add(2);
        my_tree_set.add(34);
        // my_tree_set.add(null); выбросит исключение
        // Отоброжается в порядке возрастания элементов
        Iterator set_iter = my_tree_set.iterator();
        while (set_iter.hasNext()){
            System.out.print(set_iter.next() + " ");
        }
        // Содержит все стандартные методы
        System.out.println("\n---------------------------- *.REMOVE() ----------------------------");
        // Удалим и глянем чего получилось (кроме удаления методы возвращают булевые значения)
        boolean del_elem = my_tree_set.remove(34);
        System.out.println("Удалось удалить элемент 34 -> " + del_elem);
        boolean del_elem_2 = my_tree_set.remove(12);
        System.out.println("Удалось удалить элемент 12 -> " + del_elem_2);
        System.out.println("\nТеперь коллекция выглядит так: ");
        for (Integer int_set_prn: my_tree_set) {
            System.out.print(int_set_prn + " ");
        }
        System.out.println("\n---------------------------- *.CONTAINS() ----------------------------");
        // Немного добавим элементов для красоты
        my_tree_set.add(23);
        my_tree_set.add(13);
        my_tree_set.add(6);
        my_tree_set.add(9);
        // Проверяем метод contains()
        boolean cont_var = my_tree_set.contains(13);
        boolean cont_var_2 = my_tree_set.contains(131);
        System.out.println("Есть ли 13 в коллекции -> " + cont_var);
        System.out.println("Есть ли 131 в коллекции -> " + cont_var_2);
        System.out.println("\nТеперь коллекция выглядит так: ");
        /*
        Применяем метод toArray, что бы превратить список уникальных элементов в массив
        (тренируемся, вспоминаем). Вместо 0, можно указать и другое число (length массива),
        если оно больше текущей коллекции SET лишние ячейки заполнят null, если меньше, то
        это равносильно, что указан 0.
        */
        Integer[] arr_for_prn = my_tree_set.toArray(new Integer[20]);
        for (int i = 0; i < arr_for_prn.length; i++) {
            System.out.print(arr_for_prn[i] + " ");
        }
        System.out.println("\nРазмер массива -> " + arr_for_prn.length);
    }
}
