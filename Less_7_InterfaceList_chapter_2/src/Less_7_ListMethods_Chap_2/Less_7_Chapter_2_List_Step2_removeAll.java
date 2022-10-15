package Less_7_ListMethods_Chap_2;
/*
The removeAll() method of java.util.ArrayList class is used to remove from this list all
of its elements that are contained in the specified collection.

Syntax: -> public boolean removeAll(Collection c)

Parameters: This method takes collection c as a parameter containing elements to be removed from this list.
Returns Value: This method returns true if this list changed as a result of the call.
*/
import Less_7_ListMethods_Chap_2.MyObject.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Less_7_Chapter_2_List_Step2_removeAll {
    public static void main(String[] args) {
        // Создаем список
        ArrayList<SimpleObject> first_list = new ArrayList<>();
        first_list.add(new SimpleObject("Mikael",13));
        first_list.add(new SimpleObject("John",21));
        first_list.add(new SimpleObject("Sofiya",31));
        first_list.add(new SimpleObject("Rose",24));
        first_list.add(new SimpleObject("Paul",17));
        System.out.println("--------------------- first_list ---------------------");
        for (SimpleObject sop: first_list) {
            System.out.println(sop);
        }
        System.out.println("--------------------- another_list ---------------------");
        // Создаем второй список
        List<SimpleObject> another_list =
                Arrays.asList(new SimpleObject("Paul",17),
                              new SimpleObject("Rose",24),
                              new SimpleObject("Robert",31));
        for (SimpleObject sop_2: another_list) {
            System.out.println(sop_2);
        }
        System.out.println("--------------------- first_list.removeAll(another_list) ---------------------");
        /*
        Удаляем из коллекции first_list, все элементы из коллекции another_list. В примере, в коллекции
        another_list, присутствует элемент которого нет в первой коллекции и естественно он влияет на
        итоговый результат работы метода *.removeAll(), т.е. удаляются только полностью совпавшие.

        Результатом работы метода будет не только манипуляции с коллекциями, но и возвращение результата
        в boolean формате - true/false
        */
        boolean did_it = first_list.removeAll(another_list);
        for (SimpleObject sop: first_list) {
            System.out.println(sop);
        }
        System.out.println("Получилось -> " + did_it); // true - изменения внесены

        boolean did_it_2 = first_list.removeAll(List.of(new SimpleObject("Karl",78)));
        for (SimpleObject sop_2: first_list) {
            System.out.println(sop_2);
        }
        System.out.println("Получилось -> " + did_it_2); // false - изменения не внесены
    }
}