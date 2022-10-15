package Less_17_chap_2_TreeSet;

import Less_17_chap_2_TreeSet.MyOwnClasses.SuperHero;

import java.util.Set;
import java.util.TreeSet;

public class Less_17_TreeSet_Step3_Comparable {
    public static void main(String[] args) {
        /*
        Деревья отсортированы, а значит наши элементы класса, помещаемого в коллекцию должны
        содержать переопределенный метод compareTo интерфейса Comparable. Иначе вылетит исключение.
        */
        Set<SuperHero> sh_set = new TreeSet<>();
        sh_set.add(new SuperHero("Сокол", 136));
        sh_set.add(new SuperHero("Черная Вдова", 148));
        sh_set.add(new SuperHero("Оса", 183));
        sh_set.add(new SuperHero("Муравей", 183));
        sh_set.add(new SuperHero("Соколиный Глаз", 136));
        sh_set.add(new SuperHero("Железный Человек", 231));
        for (SuperHero sh_prn: sh_set){
            System.out.println(sh_prn);
        }


    }
}
