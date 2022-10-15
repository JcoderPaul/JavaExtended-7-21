package Less_17_chap_2_TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
TreeSet, как и TreeMap не хранит NULL!!!
Позволяем использовать стандартные методы родителей.
*/
public class Less_17_TreeSet_Step1 {
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
            System.out.println(set_iter.next());
        }
    }
}
