package Less_13_chap_3_TreeMap;
/*
- Map<K, V> descendingMap(): возвращает отображение Map, которое содержит все
элементы в обратном порядке
*/
import Less_13_chap_3_TreeMap.MyOwnClasses.Student;

import java.util.Map;
import java.util.TreeMap;

public class Less_13_TreeMap_Step3_descendingMap {
    public static void main(String[] args) {
        TreeMap<Double, Student> my_tree_map = new TreeMap<>();
        Student std_1 = new Student("Ежи","Штур", 2);
        Student std_2 = new Student("Ольгерд","Лукашевич", 3);
        Student std_3 = new Student("Божена","Стрыйкувна", 4);
        Student std_4 = new Student("Ежи","Треля", 5);
        Student std_5 = new Student("Петр","Фрончевский", 2);
        Student std_6 = new Student("Збигнев","Запасевич", 3);
        // Ключи вперемешку
        my_tree_map.put(6.1, std_1);
        my_tree_map.put(7.2, std_2);
        my_tree_map.put(8.4, std_3);
        my_tree_map.put(2.5, std_4);
        my_tree_map.put(5.2, std_5);
        my_tree_map.put(9.8, std_6);
        // Разворачиваем наши ключи в обратном порядке
        Map<Double, Student> revers_map = my_tree_map.descendingMap();

        for (Map.Entry st_prn: revers_map.entrySet()) {
            System.out.println(st_prn);
        }
    }
}
