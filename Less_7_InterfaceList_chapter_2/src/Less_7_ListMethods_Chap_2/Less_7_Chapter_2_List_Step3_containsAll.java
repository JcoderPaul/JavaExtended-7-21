package Less_7_ListMethods_Chap_2;
/*
The containsAll() method of List interface in Java is used to check if this List contains all
of the elements in the specified Collection. So basically it is used to check if a List contains
a set of elements or not.

Syntax: -> boolean containsAll(Collection col)

Parameters: This method accepts a mandatory parameter col which is of the type of collection.
This is the collection whose elements are needed to be checked if it is present in the List or not.
Return Value: The method returns True if all elements in the collection col are present in the List
otherwise it returns False.
*/
import Less_7_ListMethods_Chap_2.MyObject.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Less_7_Chapter_2_List_Step3_containsAll {
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
        System.out.println("------------------------ first_list.containsAll(another_list) ------------------------");
        /*
        Метод проверяет, содержит ли коллекция first_list, все элементы из коллекции another_list.
        Если да - true, если нет - false.
        */
        boolean did_it = first_list.containsAll(another_list);
        for (SimpleObject sop: first_list) {
            System.out.println(sop);
        }
        System.out.println("Все элементы совпали -> " + did_it); // false - не все элементы одной коллекции есть в другой
        System.out.println("------------------------ first_list.containsAll(***) ------------------------");
        boolean did_it_2 = first_list.containsAll(List.of(new SimpleObject("Rose",24),
                                                          new SimpleObject("Karoline",17)));
        for (SimpleObject sop_2: first_list) {
            System.out.println(sop_2);
        }
        System.out.println("Все элементы совпали -> " + did_it_2); // true - все элементы одной коллекции есть в другой
    }
}
