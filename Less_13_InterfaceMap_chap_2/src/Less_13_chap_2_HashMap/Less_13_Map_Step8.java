package Less_13_chap_2_HashMap;
/*
Метод возвращает множество элементов под ключами, без ключей, содержащихся в коллекции Map
!!! В качестве ключей всегда рекомендуется использовать ИМУТАБЕЛЬНЫЕ объекты !!!
Что бы не произошло, внезапного (непредвиденного нами) изменения хэшкода и мы бы
не смогли найти наш объект в коллекции. Т.е. если в качестве ключа используются самописные
классы, то все поля желательно сделать private и finale, а из методов оставить только сеттеры.
*/

import Less_13_chap_2_HashMap.MyOwnClasses.SchoolStaff;
import Less_13_chap_2_HashMap.MyOwnClasses.Student;
import Less_13_chap_2_HashMap.MyOwnClasses.Teacher;

import java.util.HashMap;
import java.util.Map;


public class Less_13_Map_Step8 {
    public static void main(String[] args) {
        // Ключи в Map могут быть и ссылки на объекты (в примере ключ - студент, данные - некая средняя оценка)
        Map<Student, Double> std_map = new HashMap<>();
        Student std_1 = new Student("Ежи","Штур", 25);
        Student std_2 = new Student("Ольгерд","Лукашевич", 26);
        Student std_3 = new Student("Божена","Стрыйкувна", 18);
        std_map.put(std_1, 7.5);
        std_map.put(std_2, 8.1);
        std_map.put(std_3, 9.1);
        for (Map.Entry entry_std : std_map.entrySet()) {
            System.out.println(entry_std.getValue() + " < - > " + entry_std.getKey());
        }
        // Создадим копию std_3
        Student std_4 = new Student("Божена","Стрыйкувна", 18);
        /*
        Помним, что для Student не переопределен метод hashCode, а теперь проверим по ключу есть ли
        похожий ключ в нашем MAP.
         */
        boolean check_the_key = std_map.containsKey(std_4);
        System.out.println(check_the_key); // Есть ли такой ключ - false
        System.out.println(std_4.equals(std_3)); // Эквивалентны ли объекты - true
        /*
        Как же так? Проверим значение Хэшей наших объектов, см. у класса Teacher, где
        метод hashCode() переопределен.
        */
        System.out.println(std_4.hashCode());
        System.out.println(std_3.hashCode());
//**************************************************************************************************************
        System.out.println("---------------------------------------------------------------------------------");
        Map<Teacher, Integer> teach_map = new HashMap<>();
        Teacher teach_1 = new Teacher("Ежи","Треля", 61);
        Teacher teach_2 = new Teacher("Петр","Фрончевский", 58);
        Teacher teach_3 = new Teacher("Збигнев","Запасевич", 65);
        teach_map.put(teach_1,21);
        teach_map.put(teach_2,18);
        teach_map.put(teach_3,26);
        for (Map.Entry entry_t : teach_map.entrySet()) {
            System.out.println(entry_t.getValue() + " < - > " + entry_t.getKey());
        }
        /*
        Помним что в Teacher мы переопределили метод hashCode в отличие от Student,
        повторим фокус с проверкой
        */
        Teacher teach_4 = new Teacher("Петр","Фрончевский", 58);
        boolean check_the_key_teacher = teach_map.containsKey(teach_4);
        System.out.println(check_the_key_teacher); // Есть ли такой ключ - true (в отличие от студентов)
        System.out.println(teach_4.equals(teach_2)); // Эквивалентны ли объекты - true
        System.out.println(teach_4.hashCode());
        System.out.println(teach_2.hashCode());
//**************************************************************************************************************
        System.out.println("---------------------------------------------------------------------------------");
        // Еще раз у объектов класса
        Map<SchoolStaff, Integer> worker_map = new HashMap<>();
        SchoolStaff worker_1 = new SchoolStaff("Яцек","Хмельник", 3241);
        SchoolStaff worker_2 = new SchoolStaff("Катажина","Фигура", 2834);
        SchoolStaff worker_3 = new SchoolStaff("Ян","Махульский", 1459);
        worker_map.put(worker_1, 23);
        worker_map.put(worker_2, 54);
        worker_map.put(worker_3, 76);
        for (Map.Entry entry_worker : worker_map.entrySet()) {
            System.out.println(entry_worker.getValue() + " < - > " + entry_worker.getKey());
        }
        SchoolStaff worker_4 = new SchoolStaff("Яцек","Хмельник", 3241);
        /*
        Помним, что для SchoolStaff не переопределен метод equals, а теперь проверим есть ли
        похожий ключ в нашем MAP.
         */
        boolean check_worker_key = worker_map.containsKey(worker_4);
        System.out.println(check_worker_key);
        /*
        !!! Есть ли такой ключ - false !!! Да хашкод перезаписан, но не перезаписан метод equals,
        и единственный доступный вариант это проверить ссылки на объекты, а они естественно разные.
        !!! Т.е. при двух этапной проверке, наши объекты по хешкоду равны, а проверку на эквивалентность
        не проходят !!!
        */
        System.out.println(worker_4.equals(worker_1)); // Эквивалентны ли объекты - false
        /*
        Метод hashCode перезаписан и проверка значения хэшей наших объектов, покажет их идентичность.
        */
        System.out.println(worker_1.hashCode());
        System.out.println(worker_4.hashCode());
    }
}
