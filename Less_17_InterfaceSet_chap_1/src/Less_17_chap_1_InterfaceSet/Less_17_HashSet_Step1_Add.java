package Less_17_chap_1_InterfaceSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Less_17_HashSet_Step1_Add {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Вася Пукин");
        mySet.add("Даша Кукина");
        mySet.add("Серега Бякин");
        mySet.add("Маша Вякина");
        mySet.add("Серега Бякин");
        mySet.add("Маша Вякина");
        /*
        Последовательность вывода не соответствует порядку добавления, (не отсортирован),
        содержит только оригинальные элементы (без повторов) (добавили 6-ть элементов в
        коллекции 4-и, т.к. 2-дубликаты)
        */
        System.out.println("--------------------- Первый вывод SETa ---------------------");
        for (String str_prn: mySet) {
            System.out.println(str_prn);
        }
        System.out.println("Размер SETa -> " + mySet.size());
        /*
        Поскольку MAP позволяет в качестве ключа использовать NULL, то и его наследник
        (не все) позволяет подобное хулиганство.
        */
        System.out.println("--------------------- Вывод SETa с NULL ---------------------");
        mySet.add(null);
        Iterator<String> my_iter = mySet.iterator();
        while (my_iter.hasNext()){
            System.out.println(my_iter.next());
        }
        // Смотрим размер SETa
        System.out.println("Размер SETa -> " + mySet.size());

    }
}
