package Less_19_Queue;

import Less_19_Queue.MyOwnSimpleClass.*;
import java.util.ArrayDeque;
import java.util.Iterator;

public class Less_19_Queue_Step1 {
    public static void main(String[] args) {
        ArrayDeque<String> my_favorite_city = new ArrayDeque<String>();
        my_favorite_city.add("Калуга");// Стандартное добавление элементов через *.add()
        my_favorite_city.addFirst("Вязьма"); // Добавляем элемент в самое начало очереди
        my_favorite_city.push("Галич"); // Добавляем элемент в самое начало по-другому
        my_favorite_city.addLast("Екатеринбург"); // Добавляем элемент в конец коллекции
        my_favorite_city.add("Уфа");
        // Смотрим чего получилось
        Iterator<String> my_iter = my_favorite_city.iterator();
        while (my_iter.hasNext()){
            System.out.print(my_iter.next() + " ");
        }
        System.out.println("\n-------------------------- Игры с методами без удаления --------------------------");
        String queFirst = my_favorite_city.getFirst(); // Получаем первый элемент без удаления
        System.out.println("Первый элемент -> " + queFirst);     // Вязьма
        String queLast = my_favorite_city.getLast(); // Получаем последний элемент без удаления
        System.out.println("Последний элемент -> " + queLast);      // Екатеринбург

        System.out.printf("Размер очереди: %d \n", my_favorite_city.size());  // 5
        System.out.println("\n-------------------------- Вывод очереди на экран с удалением --------------------------");
        /* Перебор коллекции с удалением элементов:
        1. *.peek() - возвращает элемент из начала очереди БЕЗ удаления и если он есть цикл крутится.
        2. *.pop() - возвращает элемент из начала очереди С удалением, т.е. сокращает очередь на 1.
        3. Пока не очередь не усохнет в ноль: (*) -> проверили есть ли элемент -> вывели на экран и удалили -> (*)
         */
        while(my_favorite_city.peek()!=null){ // Элемент есть в начале false/true
            System.out.println(my_favorite_city.pop()); // Извлекаем и удаляем элемент из начала
        }
        System.out.printf("Размер очереди: %d \n", my_favorite_city.size());  // 0
        System.out.println("\n-------------------------- Очередь из самописных объектов --------------------------");
        // Очередь из объектов JustMan
        ArrayDeque<JustMan> people = new ArrayDeque<JustMan>();
        people.addFirst(new JustMan("Сергей", 23)); // Добавляем в нос
        people.addLast(new JustMan("Павел", 54)); // Добавляем в хвос
        people.add(new JustMan("Мария", 13));
        people.add(new JustMan("Дарья", 48));
        people.add(new JustMan("Герасим", 35));
        // Вывод на экран
        for(JustMan man_for_prn : people){
            System.out.println(man_for_prn);
        }
    }
}
