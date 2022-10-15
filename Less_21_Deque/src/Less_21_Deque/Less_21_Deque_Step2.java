package Less_21_Deque;
/*
-> void addFirst(Е obj)  - добавляет obj в голову двунаправленной очереди.
!!! Возбуждает исключение IllegalStateException !!!, если в очереди ограниченной емкости нет места.
-> void addLast(Е obj) - добавляет obj в хвост двунаправленной очереди.
!!! Возбуждает исключение IllegalStateException !!!, если в очереди ограниченной емкости нет места.
-> boolean offerFirst(Е obj) - пытается добавить obj в голову двунаправленной очереди.
Возвращает true, если obj добавлен, и false в противном случае.
-> boolean offerLast(E obj) - пытается добавить obj в хвост двунаправленной очереди.
Возвращает true, если obj добавлен, и false в против ном случае.
(!!! Методы offer возвращают false при попытке добавить obj в полную двунаправленную очередь
ограниченной емкости !!!)
*/
import java.util.ArrayDeque;
import java.util.Deque;

public class Less_21_Deque_Step2 {
    public static void main(String[] args) {
        Deque<Integer> my_arr_deque = new ArrayDeque<>();
        my_arr_deque.addFirst(34); // Добавлен первым и в голову (3)
        my_arr_deque.addFirst(23); // Добавлен вторым и тоже в голову, сместил первый элемент (2)
        my_arr_deque.addLast(24); // Добавлен третьим в хвост (4)
        my_arr_deque.addLast(85); // Добавлен четвертым и тоже в хвост, передвинул предыдущий элемент (5)
        my_arr_deque.offerFirst(52); // Добавлен последним, но в голову (1)
        my_arr_deque.offerLast(62); // Добавлен последним в хвост (6)
        int i = 1;
        for (Integer int_prn: my_arr_deque) {
            System.out.println(i + " -> " + int_prn + " ");
            i++;
        }


    }
}
