package Less_15_LinkedHashMap;
/*
В данном примере напоминашке я использую самый интересный конструктор ->
-> LinkedHashMap(int capacity, float fillRatio, boolean Order) - Этот конструктор позволяет указать, будут
ли элементы храниться в связанном списке по порядку вставки или по порядку последнего доступа.
Если Order = true, используется порядок доступа. Если Order = false, используется порядок вставки.

Вот с этим "по порядку последнего доступа" и будем разбираться!
*/
import Less_15_LinkedHashMap.MyOwnClasses.Student;

import java.util.LinkedHashMap;
import java.util.Map;

public class Less_15_LinkedHashMap_Step1 {
    public static void main(String[] args) {
        System.out.println("***************************** Order = false *****************************");
        // !!! Если Order = false, элементы будут храниться в связанном списке по порядку вставки !!!
        Map<Double, Student> my_linked_hash_map_false =
                new LinkedHashMap<>(16,0.75f,false);
        // Студенты для my_linked_hash_map_false
        Student std_1 = new Student("Paul","Hogan", 2);
        Student std_2 = new Student("Linda","Kozlowski", 3);
        Student std_3 = new Student("John","Meillon", 4);
        Student std_4 = new Student("Maggie","Blinco", 3);

        my_linked_hash_map_false.put(6.1, std_1);
        my_linked_hash_map_false.put(7.2, std_2);
        my_linked_hash_map_false.put(8.7, std_3);
        my_linked_hash_map_false.put(2.5, std_4);
        // !!! Позволяет параметрам <K, V> быть null !!!
        my_linked_hash_map_false.put(3.5, null);
        /*
        Ключи вперемешку. Ничего не делаем по поводу сортировки и видим, что в LinkedHashMap все объекты
        располагаются в порядке добавления.
        */
        for (Map.Entry st_prn_1: my_linked_hash_map_false.entrySet()) {
            System.out.println(st_prn_1);
        }
        System.out.println("----------------------------- Обращение к коллекции -----------------------------");
        // Обратимся к нашей коллекции
        System.out.println(my_linked_hash_map_false.get(7.2));
        System.out.println(my_linked_hash_map_false.get(2.5));
        System.out.println("----------------------------- Повторный вывод элементов MAP -----------------------------");
        for (Map.Entry st_prn_1: my_linked_hash_map_false.entrySet()) {
            System.out.println(st_prn_1);
        }
        /*
        Если внимательно изучить вывод на экран, то видно, что элементы коллекции находятся в неизменном порядке
        */
//**************************************************************************************************************
        System.out.println("\n***************************** Order = true *****************************");
        /*
        !!! Если Order = true, элементы будут храниться в связанном списке по порядку доступа !!!
        Доступом (обращением) называется практически любая операция, например *.get()
        */
        Map<Double, Student> my_linked_hash_map_true =
                new LinkedHashMap<>(16,0.75f,true);
        // Студенты для my_linked_hash_map_true
        Student std_5 = new Student("Gerry","Skilton", 5);
        Student std_6 = new Student("Mark","Blum", 2);
        Student std_7 = new Student("Anne","Carlisle", 3);
        Student std_8 = new Student("Reginald","VelJohnson", 3);
        Student std_9 = new Student("Reginald","VelJohnson", 3);

        my_linked_hash_map_true.put(5.2, std_5);
        my_linked_hash_map_true.put(9.3, std_6);
        my_linked_hash_map_true.put(4.3, std_7);
        my_linked_hash_map_true.put(2.8, std_8);
        // !!! Позволяет параметрам <K, V> быть null !!!
        my_linked_hash_map_true.put(null, std_9);
        // Первоначальный вывод данных согласно порядку добавления.
        for (Map.Entry st_prn_2: my_linked_hash_map_true.entrySet()) {
            System.out.println(st_prn_2);
        }
        System.out.println("----------------------------- Обращение к коллекции -----------------------------");
        // Обратимся к нашей коллекции
        System.out.println(my_linked_hash_map_true.get(9.3));
        System.out.println(my_linked_hash_map_true.get(2.8));
        System.out.println("----------------------------- Повторный вывод элементов MAP -----------------------------");
        for (Map.Entry st_prn_2: my_linked_hash_map_true.entrySet()) {
            System.out.println(st_prn_2);
        }
        /*
        !!! Если внимательно изучить вывод на экран, то видно, что элементы коллекции находятся
        не в порядке добавления !!! Хотя применялся вполне безобидный *.get(), однако на экране
        уже другой порядок расположения элементов нежели первоначальный (при добавлении).
        В конце MAP расположились два недавно вызванных элемента, причем в порядке их вызова.
        */
    }
}