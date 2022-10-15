package Less_17_chap_2_TreeSet;
/*
headSet(E upperBound, boolean incl): возвращает объект Set, который содержит все элементы первичного
набора Set до upperBound. Параметр incl при значении true, позволяет включить в выходной набор сам
элемент upperBound
*/
import Less_17_chap_2_TreeSet.MyOwnClasses.SuperHero;

import java.util.Set;
import java.util.TreeSet;

public class Less_17_TreeSet_Step5_headSet {
    public static void main(String[] args) {

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
        // Выгребаем все, что условно ниже выбранной границы
        System.out.println("------------------------ headSet false------------------------");
        SuperHero sh_cap = new SuperHero("Баки Барнс", 149);
        sh_set.add(sh_cap);
        // false по умолчанию и это означает, что элемент upperBound = sh_cap не входит в итоговую выборку
        Set<SuperHero> set_after_headset_operation_false = sh_set.headSet(sh_cap);
        for (SuperHero set_after_hs: set_after_headset_operation_false){
            System.out.println(set_after_hs);
        }
        System.out.println("------------------------ headSet true ------------------------");
        // true принудительно и это означает, что элемент upperBound = sh_cap входит в итоговую выборку
        Set<SuperHero> set_after_headset_operation_true = sh_set.headSet(sh_cap, true);
        for (SuperHero set_after_hs: set_after_headset_operation_true){
            System.out.println(set_after_hs);
        }
    }
}
