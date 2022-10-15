package Less_17_chap_2_TreeSet;
/*
tailSet(E lowerBound, boolean incl): возвращает объект Set, который содержит все элементы первичного
набора Set, начиная с lowerBound. Параметр incl при значении true, позволяет включить в выходной набор
элемент lowerBound (!!! выставление флага incl по умолчанию, а значит итоговая выборка у tailSet и headSet
отличается это нужно помнить !!!)
*/
import Less_17_chap_2_TreeSet.MyOwnClasses.SuperHero;

import java.util.Set;
import java.util.TreeSet;

public class Less_17_TreeSet_Step6_tailSet {
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
        // Выгребаем все, что условно выше выбранной границы
        System.out.println("------------------------ tailSet true------------------------");
        SuperHero sh_cap = new SuperHero("Баки Барнс", 149);
        sh_set.add(sh_cap);
        // true по умолчанию и это означает, что элемент lowerBound = sh_cap входит в итоговую выборку
        Set<SuperHero> set_after_tailset_operation_false = sh_set.tailSet(sh_cap);
        for (SuperHero set_after_ts: set_after_tailset_operation_false){
            System.out.println(set_after_ts);
        }
        System.out.println("------------------------ tailSet false ------------------------");
        // false принудительно и это означает, что элемент lowerBound = sh_cap НЕ входит в итоговую выборку
        Set<SuperHero> set_after_tailset_operation_true = sh_set.tailSet(sh_cap, false);
        for (SuperHero set_after_hs: set_after_tailset_operation_true){
            System.out.println(set_after_hs);
        }
    }
}
