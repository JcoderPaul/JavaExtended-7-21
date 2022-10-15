package Less_21_Deque;
/*
Обладая богатым арсеналом методов Deque позволяет добавлять и удалять элементы,
как в конец очереди, так и в ее начало (отсюда двунаправленная очередь).
*/
import java.util.ArrayDeque;
import java.util.Deque;

public class Less_21_Deque_Step1 {
    public static void main(String[] args) {
            System.out.println("----------------------- LIFO -----------------------");
            // Стек первым вошел, последним вышел
            Deque<String> stack = new ArrayDeque<>();
            /*
            void push(Е obj) - добавляет элемент в голову двунаправленной очереди.
            Если в очереди фиксированного объема нет места, возбуждает исключение
            IllegalStateException.
            */
            stack.push("Аврора"); // Добавлен первым, но в голову и теперь стоит последним (4)
            stack.push("Весна"); // (3)
            stack.push("Блесна"); // (2)
            stack.push("Дятел"); // Добавлен последним, но в голову очереди и он первый (1)
            // До тех пор, пока наш 'стэк' не пустой
            while (!stack.isEmpty()) {
            /*
            рор() - возвращает элемент, находящийся в голове двунаправленной очереди,
            одновременно удаляя его из очереди. Возбуждает исключение NoSuchElementException,
            если очередь пуста.

            Т.е. эмулируем LIFO
            */
                System.out.print(stack.pop() + " ");
            }
            System.out.println("\n" + stack.size());
            System.out.println();
//**********************************************************************************************************
            System.out.println("----------------------- FIFO -----------------------");
            // Классическая очередь первым вошел первым вышел
            Deque<String> queue = new ArrayDeque<>(2);
            /*
            boolean add(E obj) - добавляет obj к вызывающей коллекции. Возвращает true,
            если obj был добавлен к коллекции, добавляет в конец очереди.
            */
            queue.add("Аврора"); // Соблюдается порядок добавления (1)
            queue.add("Весна"); // (2)
            queue.add("Блесна"); // (3)
            queue.add("Дятел"); // (4)
            while (!queue.isEmpty()) {
                /*
                remove() - удаляет элемент из головы очереди, возвращая его.
                Инициирует исключение NoSuchElementException, если очередь пуста.

                Т.е. эмулирует FIFO
                */
                System.out.print(queue.remove() + " ");
            }
            System.out.println("\n" + queue.size());
    }
}
