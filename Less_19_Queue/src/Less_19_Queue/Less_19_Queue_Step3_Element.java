package Less_19_Queue;
/*
element(): возвращает, но не удаляет, элемент из начала очереди.
Если очередь пуста, генерирует исключение NoSuchElementException;
*/
import java.util.LinkedList;
import java.util.Queue;

public class Less_19_Queue_Step3_Element {
    public static void main(String[] args) {
        Queue<String> name_que = new LinkedList<>();
        // Используются два метода
        name_que.add("Павел");
        name_que.add("Анатолий");
        name_que.add("Петр");
        name_que.add("Сергей");
        name_que.add("Наталья");
        /*
        Если очередь имеет ограниченное количество элементов,
        то *.add выкинет исключение
        */
        name_que.add("Ольга");
        /*
        Если очередь имеет ограниченное количество элементов,
        то *.offer НЕ выкинет исключение и не добавит элемент.
        */
        name_que.offer("Галина");
        name_que.offer("Валентина");
        // Элементы расположены по порядку добавления работают методы *.add и *.offer
        for (String que_prn: name_que) {
            System.out.print(" * " + que_prn + " * ");
        }
        System.out.println("\n----------------- element ----------------- ");
        System.out.println(name_que.element()); // Извлекает элемент из головы очереди
        // И сохраняет его в очереди
        for (String que_prn: name_que) {
            System.out.print(" * " + que_prn + " * ");
        }
        System.out.println("\n----------------- element after fool pool ----------------- ");
        /*
        peek(): возвращает без удаления элемент из начала очереди.
        Если очередь пуста, возвращает значение null;
        */
        while(name_que.peek()!=null){
            /*
            poll(): возвращает с удалением элемент из начала очереди.
            Если очередь пуста, возвращает значение null;
            */
            System.out.println("Отразили на экране и удалили: " + name_que.poll());
            System.out.print("Теперь очередь выглядит так -> ");
            for (String que_prn: name_que) {
                System.out.print(" * " + que_prn + " * ");
            }
            System.out.println();
        }
        /*
        Если очередь пуста, то строка -> System.out.println(name_que.element());
        выкинет -> Exception in thread "main" java.util.NoSuchElementException
        т.к. в голове очереди ничего нет.

        Если очередь пуста, то строка -> System.out.println(name_que.poll());
        выкинет -> null

        !!! Часть методов выкидывают Exception, а часть NULL !!!
        */
        System.out.println(name_que.poll());

    }
}
