package Less_8_List_Iterator;
/*
Метод listlterator() возвращает объект Listlterator, который позволяет выполнять итерацию (iterate)
элементов в прямом или обратном направлении.

- ListIterator<E> listIterator();
- ListIterator<E> listIterator(int index);
*/
import Less_8_List_Iterator.MyOwnClasses.Fish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Less_8_Iterator_Step1 {
    public static void main(String[] args) {
        List<Fish> my_catch = new ArrayList<>();
        my_catch.add(new Fish("Окунь",2.3,"пресноводный"));
        my_catch.add(new Fish("Фугу",1.8,"морской"));
        my_catch.add(new Fish("Поньё",105.36,"мультяшный"));
        /*
            Для перебора элементов коллекции мы можем использовать циклы, а можем Iterator
        */
        // Ниже написан код с применением класса ListIterator
        System.out.println("------------------------------ ListIterator ------------------------------");
        // Сначала создаем ссылку на результат метода listIterator() или iterator() (пример см.ниже)
        ListIterator<Fish> myListIterator = my_catch.listIterator();
        /*
        В цикле 'до-тех-пор-пока' начинаем перебирать нашу коллекцию, через ссылку на итератор (переборщик,
        повторяльщик). Цикл while будет, как и положено, крутиться пока метод hasNext выдает true, т.е. имеем
        следующий элемент в списке - true, берем его и выводим на печать. Нет следующего элемента в списке
        (конец lista) - false, выходим из цикла.
        */
        while (myListIterator.hasNext()) {
            // .next возвращает следующий элемент для дальнейшей работы с ним, например удаления
            Fish value = myListIterator.next();
            System.out.println("Что в улове, а вот что -> " + value);
        }
        // Ниже написан код с применением класса Iterator
        System.out.println("------------------------------ Iterator ------------------------------");
        Iterator<Fish> myIterator = my_catch.iterator();
        while (myIterator.hasNext()) {
            Fish value_2 = myIterator.next();
            System.out.println("Что в улове, а вот что -> " + value_2);
        }

    }
}
