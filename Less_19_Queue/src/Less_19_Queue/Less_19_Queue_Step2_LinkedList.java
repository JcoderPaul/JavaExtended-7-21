package Less_19_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Less_19_Queue_Step2_LinkedList {
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
        System.out.println("\n----------------- remove конкретного объекта ----------------- ");
        /*
        С указанием конкретного элемента из очереди
        */
        System.out.println(name_que.remove("Галина"));
        System.out.println(name_que.remove("Анатолий"));
        for (String que_prn: name_que) {
            System.out.print(" * " + que_prn + " * ");
        }
        System.out.println("\n----------------- remove из головы очереди ----------------- ");
        /*
        Без указания конкретного элемента в очереди удаляем с головы
        */
        String name_for_delete = name_que.remove(); // Если удалять больше нечего из очереди вылетит исключение
        System.out.println(name_for_delete); // На экран выводится элемент который будет удален
        for (String que_prn: name_que) {
            System.out.print(" * " + que_prn + " * ");
        }


    }
}
