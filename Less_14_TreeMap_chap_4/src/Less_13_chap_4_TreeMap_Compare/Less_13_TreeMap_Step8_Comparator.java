package Less_13_chap_4_TreeMap_Compare;
/*
Немного изменим ситуацию пусть наш класс снова будет ключом, его мы сделали final,
НО ОН НЕ БУДЕТ подписан на Comparable и НЕ БУДЕТ ИМЕТЬ метода compareTo, для возможности
сортировки, т.к. TreeMap отсортированный по ключу список.
!!! Тут мы применяем Comparator !!!
*/
import Less_13_chap_4_TreeMap_Compare.MyOwnClasses.Teacher;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Less_13_TreeMap_Step8_Comparator {
    public static void main(String[] args) {
        /*
        Наш класс Teacher не подписан на интерфейс Comparable и мы применяем Comparator
        мы задаем его в параметрах нашего TreeMap
        */
        Map<Teacher, Integer> my_tree_map = new TreeMap<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher teacher_1, Teacher teacher_2) {
                if((teacher_1.getName()).compareTo(teacher_2.getName()) == 0) {
                    return (teacher_1.getSurname()).compareTo(teacher_2.getSurname());
                } else {
                    return (teacher_1.getName()).compareTo(teacher_2.getName());
                }
            }
        });
        Teacher teacher_1 = new Teacher("Ежи","Штур", 2);
        Teacher teacher_2 = new Teacher("Ежи","Лукашевич", 3);
        Teacher teacher_3 = new Teacher("Божена","Стрыйкувна", 4);
        Teacher teacher_4 = new Teacher("Збигнев","Адолянский", 3);
        Teacher teacher_5 = new Teacher("Ежи","Треля", 5);
        Teacher teacher_6 = new Teacher("Збигнев","Фрончевский", 2);
        Teacher teacher_7 = new Teacher("Збигнев","Запасевич", 3);
        // Ключи вперемешку
        my_tree_map.put(teacher_1, 2356);
        my_tree_map.put(teacher_2, 3466);
        my_tree_map.put(teacher_3, 73254);
        my_tree_map.put(teacher_4, 3462);
        my_tree_map.put(teacher_5, 7565);
        my_tree_map.put(teacher_6, 9434);
        my_tree_map.put(teacher_7, 24778);
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
