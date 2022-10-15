package Less_20_PriorityQueue;
/*
Примеры напоминалки на приоритетность элементов в "очереди с приоритетами"
*/
import java.util.PriorityQueue;
import java.util.Queue;

public class Less_20_PriorityQueue_Step2 {
    public static void main(String[] args) {
        Queue<Integer> int_que = new PriorityQueue<>();
        int_que.offer(12);
        int_que.offer(54);
        int_que.offer(2);
        int_que.offer(744);
        int_que.offer(235);
        int_que.offer(-23);
        int_que.offer(0);
        System.out.print("Наша очередь через FOREACH (без сортировки): ");
        for (Integer int_prn_que: int_que) {
            System.out.print(int_prn_que + " ");
        }
        System.out.println("\n-------------- peek --------------");
        /*
        peek() - возвращает элемент из головы очереди. Возвращает null, если очередь пуста.
        Элемент не удаляется.
        */
        int my_head_element = int_que.peek();
        /* Получаем наш головной (приоритетный элемент).
        !!! Особенность !!!
        Если оставить код так, как он прописан сейчас, т.е. с присваиванием результата метода
        *.peek() некой INT переменной, можно словить исключение если наша очередь пуста.
        Однако если код будет, например, таким -> System.out.println(int_que.peek());
        то на экран выйдет null.
        !!! Оно и понятно, т.к. простой INT может быть 0, но не может быть NULL !!!
        */
        System.out.println(my_head_element);
        int_que.remove(); // Удаляем голову
        System.out.println(int_que.peek()); // Получаем значение новой головы
    }
}
