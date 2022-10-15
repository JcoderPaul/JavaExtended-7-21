package Less_7_ListMethods_Chap_2;
/*
"retained - сохраненный"

The retainAll() method of ArrayList is used to remove all the array list’s elements that are
not contained in the specified collection or retains all matching elements in the current
ArrayList instance that match all elements from the Collection list passed as a parameter to the method.

Syntax: -> public boolean retainAll(Collection 'C')

Parameters: The 'C' is the collection containing elements to be retained in the list.
Return Value: The method returns a boolean value true if the list is changed at all as a result
of the call else false.

Exceptions:
ClassCastException: If the class of an element of this ArrayList is incompatible with the Passed
collection. This is optional.
NullPointerException: If the list contains a null element and the passed collection does not permit
null elements, or if the specified collection is null. This is also optional.
*/
import Less_7_ListMethods_Chap_2.MyObject.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Less_7_Chapter_2_List_Step4_retainAll {

    public static void main(String[] args) {
        // Создаем список
        ArrayList<SimpleObject> first_list = new ArrayList<>();
        first_list.add(new SimpleObject("Piter",13));
        first_list.add(new SimpleObject("Theo",21));
        first_list.add(new SimpleObject("Sofiya",31));
        first_list.add(new SimpleObject("Rose",24));
        first_list.add(new SimpleObject("Karoline",17));
        System.out.println("------------------------ first_list ------------------------");
        for (SimpleObject sop: first_list) {
            System.out.println(sop);
        }
        System.out.println("------------------------ another_list ------------------------");
        // Создаем второй список
        List<SimpleObject> another_list =
                Arrays.asList(new SimpleObject("Paul",17),
                        new SimpleObject("Rose",24),
                        new SimpleObject("Leonard",31),
                        new SimpleObject("Karoline",17));
        for (SimpleObject sop_2: another_list) {
            System.out.println(sop_2);
        }
        System.out.println("------------------------ first_list.retainAll(another_list) ------------------------");
        /*
        Удаляем из коллекции first_list, все элементы не из коллекции another_list. Или наоборот, оставить
        в коллекции first_list все элементы из коллекции another_list. В примере, в коллекции
        another_list, присутствуют два элемента, которых нет в первой коллекции и естественно они не
        будут влиять на итоговый результат работы метода *.retainAll(), т.е. удаляются только полностью
        совпавшие.
        */
        boolean did_it = first_list.retainAll(another_list);
        for (SimpleObject sop: first_list) {
            System.out.println(sop);
        }
        System.out.println("Получилось -> " + did_it); // true - изменения внесены

        boolean did_it_2 = first_list.retainAll(List.of(new SimpleObject("Rose",24),
                                                        new SimpleObject("Karoline",17)));
        for (SimpleObject sop_2: first_list) {
            System.out.println(sop_2);
        }
        System.out.println("Получилось -> " + did_it_2); // false - изменения не внесены, т.к. коллекции совпали
    }
}
