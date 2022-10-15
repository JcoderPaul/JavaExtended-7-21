package Less_17_chap_1_InterfaceSet;

import Less_17_chap_1_InterfaceSet.MyOwnClasses.Person;

import java.util.HashSet;
import java.util.Set;

public class Less_17_HashSet_Step2_Remove {
    public static void main(String[] args) {

        Set<String> russia_city = new HashSet<String>();

        // Добавляем элементы
        russia_city.add("Нижний Новгород");
        russia_city.add("Калуга");
        russia_city.add("Екатеринбург");
        russia_city.add("Новосибирск");
        russia_city.add("Уфа");
        // Добавляем дубликат
        boolean isAdded = russia_city.add("Уфа");
        System.out.println(isAdded);    // false

        System.out.printf("Set contains %d elements \n", russia_city.size());    // 5
        System.out.println("--------------------------------------------------------------------------");
        for(String rs : russia_city){
            System.out.println(rs);
        }
        System.out.println("--------------------------------------------------------------------------");
        // Удалим элемент
        russia_city.remove("Калуга");
        System.out.printf("Set contains %d elements \n", russia_city.size());    // 4
        for(String rs_2 : russia_city){
            System.out.println(rs_2);
        }
        System.out.println("--------------------------------------------------------------------------");
        // Хеш-таблица объектов Person
        Set<Person> people = new HashSet<Person>();
        people.add(new Person("Павел"));
        people.add(new Person("Георгий"));
        people.add(new Person("Тамара"));
        people.add(new Person("Татьяна"));
        for(Person p : people){
            System.out.println(p.getName());
        }
    }
}
