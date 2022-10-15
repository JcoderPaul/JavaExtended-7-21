package Less_17_chap_1_InterfaceSet;

import java.util.HashSet;
import java.util.Set;

public class Less_17_HashSet_Step4_isEmpty {
    public static void main(String[] args) {
        // Создаем коллекцию и заполняем
        Set<String> mySet = new HashSet<>();
        mySet.add("Вася Пукин");
        mySet.add("Даша Кукина");
        mySet.add("Серега Бякин");
        mySet.add("Маша Вякина");
        // Создаем коллекцию не заполняя
        Set<String> myEmptySet = new HashSet<>();

        System.out.println("mySet пуста ли -> " + mySet.isEmpty());
        System.out.println("myEmptySet пуста ли -> " + myEmptySet.isEmpty());

    }
}
