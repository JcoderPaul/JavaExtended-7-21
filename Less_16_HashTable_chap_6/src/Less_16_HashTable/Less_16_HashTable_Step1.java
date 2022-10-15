package Less_16_HashTable;
/*
!!! НЕ ПРИЕМЛЕТ NULL В КАЧЕСТВЕ КЛЮЧА ИЛИ СВЯЗКИ !!!
*/
import Less_16_HashTable.MyOwnClasses.Student;

import java.util.Hashtable;
import java.util.Map;

public class Less_16_HashTable_Step1 {
    public static void main(String[] args) {
        Map<Double, Student> my_hash_table = new Hashtable<>();
        // Студенты для my_linked_hash_map_false
        Student std_1 = new Student("Paul","Hogan", 2);
        Student std_2 = new Student("Linda","Kozlowski", 3);
        Student std_3 = new Student("John","Meillon", 1);
        Student std_4 = new Student("Maggie","Blinco", 3);

        my_hash_table.put(6.1, std_1);
        my_hash_table.put(7.2, std_2);
        my_hash_table.put(8.7, std_3);
        my_hash_table.put(2.5, std_4);
        /*
        !!! НЕ Позволяет параметрам <K, V> быть null !!!

        my_hash_table.put(3.5, null);
        my_hash_table.put(null, std_4);

        Позволяет добавлять (на этапе написания кода), однако при запуске выкидывает ->
        -> Exception in thread "main" java.lang.NullPointerException
        */

        /*
        Ключи вперемешку. Ничего не делаем по поводу сортировки и видим, что все объекты
        располагаются абы как (я не уловил принципа распределения).
        */
        for (Map.Entry st_prn_1: my_hash_table.entrySet()) {
            System.out.println(st_prn_1);
        }
    }
}
