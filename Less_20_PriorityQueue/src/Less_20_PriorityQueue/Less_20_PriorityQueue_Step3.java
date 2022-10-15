package Less_20_PriorityQueue;
/*
Используем в нашей очереди самописный класс который !!!! имплементирует Comparable !!!!,
если бы этого не было, то мы не смогли бы использовать очередь для элементов нашего класса,
т.к. непонятно, как сортировать (определять приоритетность) элементы созданные от нашего класса.
Ошибка бы вылетала уже при добавлении элементов в очередь, в runtime.
*/
import Less_20_PriorityQueue.MyOwnClasses.SuperHero;
import java.util.PriorityQueue;

public class Less_20_PriorityQueue_Step3 {
    public static void main(String[] args) {
        PriorityQueue<SuperHero> que_for_hero = new PriorityQueue<>();
        /*
        Приоритет элемента не зависит от порядка добавления в очередь,
        все определяет правило их сравнения (обычно естественное)
        */
        que_for_hero.add(new SuperHero("Сокол", 136));
        que_for_hero.add(new SuperHero("Черная Вдова", 148));
        que_for_hero.add(new SuperHero("Оса", 183));
        que_for_hero.add(new SuperHero("Муравей", 183));
        que_for_hero.add(new SuperHero("Соколиный Глаз", 136));
        que_for_hero.add(new SuperHero("Железный Человек", 231));
        que_for_hero.add(new SuperHero("Странный Дохтур", 256));
        SuperHero sh_cap = new SuperHero("Баки Барнс", 149);
        que_for_hero.add(sh_cap);
        SuperHero iron_war = new SuperHero("Железный Воитель", 219);
        que_for_hero.add(iron_war);
        /*
        В классе SuperHero метод compareTo переписан с учетом суперсилы, а при совпадении оной по имени.
        Однако тут, как и в случае со String или Integer вывод на экран идет абы-как. Попробуем использовать
        remove для удаления элемента с наивысшим приоритетом и одновременным выводом его на экран, см. ниже.
        */
        System.out.println("Стандартный вывод через FOREACH ->");
        for (SuperHero sh_prn: que_for_hero){
            System.out.println(sh_prn);
        }
        /*
        Удаляем голову очереди с одновременным выводом на экран до тех пор, пока не закончатся элементы очереди
        */
        System.out.println("\nВывод с затрагиванием приоритетности элементов ->");
        while (que_for_hero.size() > 0){
            System.out.println(que_for_hero.remove());
        }
    }
}
