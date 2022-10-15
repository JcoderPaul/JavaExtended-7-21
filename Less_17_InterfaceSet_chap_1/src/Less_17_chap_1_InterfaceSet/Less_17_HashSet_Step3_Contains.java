package Less_17_chap_1_InterfaceSet;

import java.util.HashSet;
import java.util.Set;

public class Less_17_HashSet_Step3_Contains {
    public static void main(String[] args) {
        // Создаем коллекцию и заполняем
        Set<String> mySet = new HashSet<>();
        mySet.add("Вася Пукин");
        mySet.add("Даша Кукина");
        mySet.add("Серега Бякин");
        mySet.add("Маша Вякина");
        // Проверяем есть ли элемент
        String find_elem = "Вася Пукин";
        String find_elem_2 = "Каряка Рубакин";
        System.out.println(find_elem + " есть ли в SETe -> " + mySet.contains(find_elem));
        System.out.println(find_elem_2 + " есть ли в SETe -> " + mySet.contains(find_elem_2));
    }
}
