package Less_20_PriorityQueue;
/*
PriorityQueue – это класс очереди с приоритетами. По умолчанию очередь с приоритетами размещает
элементы согласно естественному порядку сортировки используя Comparable.

Например, если это String или Integer то сортировка и приоритетность по алфавиту, как вариант.
*/
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Less_20_PriorityQueue_Step1 {
    public static void main(String[] args) {
        System.out.println("\n-------------- Вывод прямо при помощи Comparable --------------");
        /*
        Размер и метод сортировки не задан, т.е. по умолчанию
        (в данном примере используем все удовольствия String)
        */
        Queue<String> city_que = new PriorityQueue<>();
        city_que.offer("Галич");
        city_que.offer("Гдов");
        city_que.offer("Козельск");
        city_que.offer("Елабуга");
        city_que.offer("Вятка");
        /*
        !!! Если делать обычный вывод нашей очереди на экран, то как такового порядка, сортировки не видно !!!
        */
        System.out.print("Priority queue simple output to the screen in a loop without sorting: ");
        for (String str_prn: city_que) {
            System.out.print(str_prn + " ");
        }
        System.out.println("\nРазмер очереди -> " + city_que.size());
        /*
        !!! Однако, как только мы начинаем использовать методы работающие с приоритетностью
        все встает на свои места, появляется порядок !!!
        */
        System.out.print("Priority queue with Comparable: ");
        while (city_que.size() > 0) {
            // Выводим на экран и удаляем
            System.out.print(city_que.remove() + " ");
        }
        System.out.println("\nРазмер очереди -> " + city_que.size());
        System.out.println("\n-------------- Вывод с реверсом при помощи Comparator --------------");
        // Задаем емкость очереди и способ сортировки через Comparator, который передается через конструктор
        PriorityQueue<String> sity_for_revers =
                new PriorityQueue<>(5, Collections.reverseOrder());
        sity_for_revers.offer("Ужгород");
        sity_for_revers.offer("Кемь");
        sity_for_revers.offer("Новгород");
        sity_for_revers.offer("Каргополь");
        sity_for_revers.offer("Клин");
        System.out.print("Priority queue simple output to the screen in a loop without sorting: ");
        for (String str_prn: sity_for_revers) {
            System.out.print(str_prn + " ");
        }
        System.out.println("\nРазмер очереди -> " + sity_for_revers.size());
        System.out.print("Priority queue with Comparator: ");
        while (sity_for_revers.size() > 0) {
            // Выводим на экран и удаляем
            System.out.print(sity_for_revers.remove() + " ");
        }
        System.out.println("\nРазмер очереди -> " + sity_for_revers.size());
        System.out.println("\n-------------- Вывод прямо при помощи Comparable --------------");
        /*
        Размер и метод сортировки не задан, т.е. по умолчанию
        (в данном примере используем все удовольствия Integer)
        */
        Queue<Integer> int_que = new PriorityQueue<>();
        int_que.offer(12);
        int_que.offer(54);
        int_que.offer(2);
        int_que.offer(744);
        int_que.offer(235);
        int_que.offer(-23);
        int_que.offer(0);
        System.out.print("Priority queue simple output to the screen in a loop without sorting: ");
        for (Integer integer_prn: int_que) {
            System.out.print(integer_prn + " ");
        }
        System.out.println("\nРазмер очереди -> " + int_que.size());
        System.out.print("Priority queue with Comparable: ");
        while (int_que.size() > 0) {
            System.out.print(int_que.remove() + " ");
        }
        System.out.println("\nРазмер очереди -> " + int_que.size());
    }
}
