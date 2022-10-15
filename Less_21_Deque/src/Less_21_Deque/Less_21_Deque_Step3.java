package Less_21_Deque;
/*
-> Е pollFirst() - возвращает элемент, находящийся в голове двунаправленной очереди, одновременно удаляя его
 из очереди. Возвращает null, если очередь пуста.
-> Е pollLast() - возвращает элемент, находящийся в хвосте двунаправленной очереди, одновременно удаляя его
из очереди. Возвращает null, если очередь пуста.
-> Е removeLast() - возвращает элемент, находящийся в конце двунаправленной очереди, удаляя его в процессе.
Возбуждает исключение NoSuchElementException, если очередь пуста.
-> Е removeFirst() - возвращает элемент, находящийся в голове двунаправленной очереди, одновременно удаляя
его из очереди. Возбуждает исключение NoSuchElementException, если очередь пуста.
*/
import java.util.ArrayDeque;
import java.util.Deque;

public class Less_21_Deque_Step3 {
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
        System.out.println("----------------- removeFirst - removeLast - pollFirst - pollLast -----------------");
        System.out.print("Очередь до чистки с обоих концов -> ");
        for (Integer int_prn: my_arr_deque) {
            System.out.print(int_prn + " ");
        }
        System.out.println();

        if(my_arr_deque.isEmpty()){
            System.out.println("Нет возможности удалять элементы");
        } else {
            System.out.println("Удалили: " + my_arr_deque.removeFirst());
            for (Integer int_prn: my_arr_deque) {
                System.out.print(int_prn + " ");
            }
            System.out.println(" <- Удалили элемент из головы\t");
            System.out.println("Удалили: " + my_arr_deque.removeLast());
            for (Integer int_prn: my_arr_deque) {
                System.out.print(int_prn + " ");
            }
            System.out.println(" <- Удалили элемент из хвоста\t");
        }
        System.out.println("Удалили: " + my_arr_deque.pollFirst());
        for (Integer int_prn: my_arr_deque) {
            System.out.print(int_prn + " ");
        }
        System.out.println(" <- Удалили элемент из головы\t");
        System.out.println("Удалили: " + my_arr_deque.pollLast());
        for (Integer int_prn: my_arr_deque) {
            System.out.print(int_prn + " ");
        }
        System.out.println(" <- Удалили элемент из хвоста\t");

    }
}
