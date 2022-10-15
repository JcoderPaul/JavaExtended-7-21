package Less_19_Queue;
/*
peek(): возвращает без удаления элемент из начала очереди.
Если очередь пуста, возвращает значение null;
*/
import java.util.LinkedList;
import java.util.Queue;

public class Less_19_Queue_Step4_Peek {
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
        System.out.println("\n----------------- peek ----------------- ");
        String name_on_head_of_queue = name_que.peek();// Извлекает элемент из головы очереди не меняет очередь
        System.out.println(name_on_head_of_queue);
            for (String que_prn: name_que) {
                System.out.print(" * " + que_prn + " * ");
            }
    }
}
