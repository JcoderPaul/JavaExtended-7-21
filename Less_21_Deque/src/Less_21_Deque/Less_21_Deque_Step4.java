package Less_21_Deque;

import java.util.ArrayDeque;
import java.util.Deque;

/*
-> Е getFirst() - возвращает первый элемент двунаправленной очереди. Объект из очереди не удаляется.
В случае пустой двунаправленной очереди возбуждает исключение NoSuchElementException.
-> Е getLast() - возвращает последний элемент двунаправленной очереди. Объект из очереди не удаляется.
В случае пустой двунаправленной очереди возбуждает исключения NoSuchElementException.
-> Е peekFirst() - возвращает элемент, находящийся в голове двунаправленной очереди.
Возвращает null, если очередь пуста. Объект из очереди не удаляется.
-> Е peekLast() - возвращает элемент, находящийся в хвосте двунаправленной очереди.
Возвращает null, если очередь пуста. Объект из очереди не удаляется.
*/
public class Less_21_Deque_Step4 {
    public static void main(String[] args) {
        Deque<Integer> my_arr_deque = new ArrayDeque<>();
        // Обычный классический порядок добавления в конец
        my_arr_deque.add(34);
        my_arr_deque.add(23);
        my_arr_deque.add(24);
        my_arr_deque.add(85);
        my_arr_deque.add(52);
        my_arr_deque.add(62);
        int i = 1;
        for (Integer int_prn: my_arr_deque) {
            System.out.println(i + " -> " + int_prn + " ");
            i++;
        }
        System.out.println("----------------- getFirst - getLast - peekFirst - peekLast -----------------");
        System.out.println(my_arr_deque.getFirst());
        System.out.println(my_arr_deque.getLast());
        System.out.println(my_arr_deque.peekFirst());
        System.out.println(my_arr_deque.peekLast());
        System.out.println("----------------- removeAll -----------------");
        my_arr_deque.removeAll(my_arr_deque);
        System.out.println("Размер очереди -> " + my_arr_deque.size());
        System.out.println("----------------- Снова peekFirst - peekLast -----------------");
        System.out.println(my_arr_deque.peekFirst());
        System.out.println(my_arr_deque.peekLast());
    }
}
