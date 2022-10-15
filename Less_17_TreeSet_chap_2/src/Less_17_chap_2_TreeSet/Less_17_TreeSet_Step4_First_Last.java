package Less_17_chap_2_TreeSet;

import Less_17_chap_2_TreeSet.MyOwnClasses.SuperHero;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Less_17_TreeSet_Step4_First_Last {
    public static void main(String[] args) {
        /*
        Деревья отсортированы, а значит наши элементы класса, помещаемого в коллекцию должны
        содержать переопределенный метод compareTo интерфейса Comparable. Иначе вылетит исключение.
        */
        TreeSet<SuperHero> sh_set = new TreeSet<>();
        sh_set.add(new SuperHero("Сокол", 136));
        sh_set.add(new SuperHero("Черная Вдова", 148));
        sh_set.add(new SuperHero("Оса", 183));
        sh_set.add(new SuperHero("Муравей", 183));
        sh_set.add(new SuperHero("Соколиный Глаз", 136));
        sh_set.add(new SuperHero("Железный Человек", 231));
        // Коллекция отсортирована по уровню суперсилы, при совпадении оной, по имени
        for (SuperHero sh_prn: sh_set){
            System.out.println(sh_prn);
        }
//**********************************************************************************************************
        System.out.println("------------------------ first and last in SET------------------------");
        /*
        Применение методов first и last, возможно при создании ссылки через TreeSet<T> tree_set = ... ,
        а не через Set<T> tree_set = ... Либо в момент вызова соответствующего метода потребуется кастомизация,
        до дочернего класса см. пример ниже.
        */
        System.out.println(sh_set.first());
        System.out.println(sh_set.last());
        System.out.println("------------------------ first and last for MY_HERO------------------------");
        /*
        В отличие от первого варианта (см.выше) создаем ссылку через Set<SuperHero> my_super_hero = ...
        и при запросе методов first и last проводим кастомизацию до TreeSet.
        */
        Set<SuperHero> my_super_hero = new TreeSet<>();
        my_super_hero.add(new SuperHero("Малкольм Стоун", 238));
        my_super_hero.add(new SuperHero("Санара Куэста", 201));
        my_super_hero.add(new SuperHero("Дуглас Линд", 184));
        Iterator<SuperHero> sh_iter = my_super_hero.iterator();
        while (sh_iter.hasNext()){
            System.out.println(sh_iter.next());
        }
        System.out.println("------------------------ first and last in MY HERO SET------------------------");
        System.out.println(((TreeSet)my_super_hero).first());
        System.out.println(((TreeSet)my_super_hero).last());
    }
}
