package Less_13_chap_4_TreeMap_Compare;
/*
Немного изменим ситуацию пусть наш класс снова будет ключом, его мы сделали final,
подписали на интерфейс Comparable и переопределили метод compareTo, для возможности
сортировки, т.к. TreeMap отсортированный по ключу список.
*/
import Less_13_chap_4_TreeMap_Compare.MyOwnClasses.Student;

import java.util.Map;
import java.util.TreeMap;

public class Less_13_TreeMap_Step7_Comparable {
    public static void main(String[] args) {
        //
        Map<Student, Double> my_tree_map = new TreeMap<>();
        Student std_1 = new Student("Ежи","Штур", 2);
        Student std_2 = new Student("Ежи","Лукашевич", 3);
        Student std_3 = new Student("Божена","Стрыйкувна", 4);
        Student std_7 = new Student("Збигнев","Адолянский", 3);
        Student std_4 = new Student("Ежи","Треля", 5);
        Student std_5 = new Student("Збигнев","Фрончевский", 2);
        Student std_6 = new Student("Збигнев","Запасевич", 3);
        // Ключи вперемешку
        my_tree_map.put(std_1, 6.1);
        my_tree_map.put(std_2, 7.2);
        my_tree_map.put(std_3, 8.4);
        my_tree_map.put(std_4, 2.5);
        my_tree_map.put(std_5, 5.2);
        my_tree_map.put(std_6, 9.8);
        my_tree_map.put(std_7, 4.8);
        /*
        Ничего не делаем по поводу сортировки и видим, что в TreeMap все объекты автоматически сортируются
        по возрастанию их ключей.
        */
        for (Map.Entry st_prn: my_tree_map.entrySet()) {
            System.out.println(st_prn);
        }
//**************************************************************************************************************
        System.out.println("----------------------------------------------------------------------------");

    }
}
