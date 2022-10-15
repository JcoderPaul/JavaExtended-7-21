package Less_13_chap_2_HashMap;

import Less_13_chap_2_HashMap.MyOwnClasses.SolidImmutableHero;
import Less_13_chap_2_HashMap.MyOwnClasses.Teacher;

import java.util.HashMap;
import java.util.Map;

public class Less_13_Map_Step9_NotFindElemant {
    public static void main(String[] args) {
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
        System.out.println("-----------------------------------------------------------------------------");
        /*
        В классе Teacher есть геттер и сеттер на поле age, ведь оно private, но не final.
        Меняем возраст объекта на год и смотрим, что произошло.
        */
        System.out.println(teach_2.hashCode()); // Печатаем хэшкод
        System.out.println(teach_map.containsKey(teach_2)); // Проверяем есть ли такой ключ в MAP
//**************************************************************************************************************
        teach_2.setAge(teach_2.getAge() + 1); // Меняем значение age в ключевом объекте
        System.out.println(teach_2.hashCode()); // Проверяем хэшкод после изменений
        System.out.println(teach_map.containsKey(teach_2)); // Проверяем есть ли такой ключ (с измененым age) в MAP
//**************************************************************************************************************
        System.out.println("-----------------------------------------------------------------------------");
        /*
        Если использовать имутабельный ключ, то коллизии подобной выше не произойдет
        */
        Map<SolidImmutableHero, Integer> hero_map = new HashMap<>();
        SolidImmutableHero hr_1 = new SolidImmutableHero("Капитан Америка",121);
        SolidImmutableHero hr_2 = new SolidImmutableHero("Сокол",98);
        SolidImmutableHero hr_3 = new SolidImmutableHero("Грут",165);
        hero_map.put(hr_1,21);
        hero_map.put(hr_2,18);
        hero_map.put(hr_3,26);
        for (Map.Entry hr_prn:hero_map.entrySet()) {
            System.out.println(hr_prn);
        }
        /*
        Пока все нормально, теперь попробуем изменить любой ключ-объект из нашей геройской MAP и
        не можем т.к. у нас из методов только геттеры, а поля константы. Про 'ключи-от-всех-дверей'
        мы тут не говорим, про рефлексию!
        */

    }
}
