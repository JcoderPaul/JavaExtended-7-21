package Less_17_chap_2_TreeSet;
/*
subSet(E lowerBound, boolean lowerIncl, E upperBound, boolean highIncl): возвращает объект Set,
который содержит все элементы первичного набора Set от lowerBound до upperBound.
*/
import Less_17_chap_2_TreeSet.MyOwnClasses.SuperHero;

import java.util.Set;
import java.util.TreeSet;

public class Less_17_TreeSet_Step7_subSet {
    public static void main(String[] args) {

        TreeSet<SuperHero> sh_set = new TreeSet<>();
        sh_set.add(new SuperHero("Сокол", 136));
        sh_set.add(new SuperHero("Черная Вдова", 148));
        sh_set.add(new SuperHero("Оса", 183));
        sh_set.add(new SuperHero("Муравей", 183));
        sh_set.add(new SuperHero("Соколиный Глаз", 136));
        sh_set.add(new SuperHero("Железный Человек", 231));
        sh_set.add(new SuperHero("Странный Дохтур", 256));
        SuperHero sh_cap = new SuperHero("Баки Барнс", 149);
        sh_set.add(sh_cap);
        SuperHero iron_war = new SuperHero("Железный Воитель", 219);
        sh_set.add(iron_war);
        // Коллекция отсортирована по уровню суперсилы, при совпадении оной, по имени
        for (SuperHero sh_prn: sh_set){
            System.out.println(sh_prn);
        }
//**********************************************************************************************************
        // Выгребаем все, что условно в пределах выбранных границ
        System.out.println("------------------------ subSet по умолчанию ------------------------");
        // Нижняя граница выборки входит в ее состав (inclusive), верхняя нет (exclusive)
        Set<SuperHero> set_after_subset_operation_forward = sh_set.subSet(sh_cap, iron_war);
        for (SuperHero set_after_ts: set_after_subset_operation_forward){
            System.out.println(set_after_ts);
        }
        System.out.println("------------------------ !!! subSet hand made !!!! ------------------------");
        /*
        Делаем ручной выбор, входит ли та или иная граница (lowerBound, upperBound) выборки в ее состав
        (true - inclusive - входит), или (false - exclusive - НЕ входит). В примере ниже обе границы
        входят в итоговую выборку.
        */
        Set<SuperHero> set_after_subset_operation_handmade =
                sh_set.subSet(sh_cap, true , iron_war, true);
        for (SuperHero set_after_ts: set_after_subset_operation_handmade){
            System.out.println(set_after_ts);
        }
    }
}
