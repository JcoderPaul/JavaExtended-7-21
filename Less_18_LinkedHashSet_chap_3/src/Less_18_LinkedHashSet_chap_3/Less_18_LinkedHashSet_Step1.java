package Less_18_LinkedHashSet_chap_3;
/*
LinkedHashSet запоминает последовательность добавления элементов.
В отличие от LinkedHashMap не учитывает порядок доступа
(см. напоминалку Less_15_LinkedHashMap).
*/
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Less_18_LinkedHashSet_Step1 {
    public static void main(String[] args) {
        // Создали SET и добавили элементы
        LinkedHashSet<Integer> int_lhs = new LinkedHashSet<>();
        int_lhs.add(21);
        int_lhs.add(2);
        int_lhs.add(45);
        int_lhs.add(7);
        int_lhs.add(81);
        int_lhs.add(125);
        // Вывели на экран наш SET
        Iterator<Integer> my_iter = int_lhs.iterator();
        while (my_iter.hasNext()){
            System.out.print(my_iter.next() + " "); // Результат вывода в порядке добавления
        }
//*********************** ПРОВЕРИМ ПРОСТЫЕ МЕТОДЫ ***********************************************************
        System.out.println("\n---------------------- ПРОСТАЯ КРАТКАЯ ПРОВЕРКА МЕТОДОВ ----------------------");
        System.out.println("Есть ли в SET 45 -> " + int_lhs.contains(45)); // Проверяем наличие элемента 45
        System.out.println("Удалим 45 из коллекции!");
        int_lhs.remove(45); // Удаляем этот элемент 45
        System.out.println("Есть ли в SET 45 теперь -> " + int_lhs.contains(45)); // Снова проверяем
        for (Integer int_prn: int_lhs) {
            System.out.print(int_prn + " ");
        }

    }
}
