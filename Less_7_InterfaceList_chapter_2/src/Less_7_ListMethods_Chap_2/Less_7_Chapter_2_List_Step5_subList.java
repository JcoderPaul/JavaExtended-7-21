package Less_7_ListMethods_Chap_2;
/*
The subList() method of java.util.ArrayList class is used to return a view of the portion of
this list between the specified fromIndex, inclusive, and toIndex, exclusive. (If fromIndex
and toIndex are equal, the returned list is empty.)

The returned list is backed by this list, so non-structural changes in the returned list are
reflected in this list, and vice-versa. The returned list supports all of the optional list operations.

Syntax: -> public List subList(int fromIndex, int toIndex)
Parameters: This method takes the following argument as a parameter.
*/
import Less_7_ListMethods_Chap_2.MyObject.SimpleObject;

import java.util.ArrayList;
import java.util.List;

public class Less_7_Chapter_2_List_Step5_subList {
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
        System.out.println("------------------------ another_list метод .subList(ind_1, ind_2)------------------------");
        /*
        Создаем второй список из первого методом *.subList() с элемента с индексом 1 включительно
        по индекс 3 исключая его. Но мы получаем, как бы отражение того списка из которого сделали
        текущий список методом *.subList()
        */
        List<SimpleObject> another_list = first_list.subList(1,3);
        for (SimpleObject sop_2: another_list) {
            System.out.println(sop_2);
        }

        System.out.println("------------------------ Вносим изменения в another_list методом *.add() ------------------------");
        another_list.add(new SimpleObject("Rafael",38));
        for (SimpleObject sop_2: another_list) {
            System.out.println(sop_2);
        }

        System.out.println("------------------------ И снова на экране first_list ------------------------");
        // В итоге, изменения в списке полученного методом subList отразились в первичном списке
        for (SimpleObject sop: first_list) {
            System.out.println(sop);
        }
        System.out.println("------------------------ И снова на экране another_list ------------------------");
        /*
        !!! Если внести изменения в исходный список и попытаться обратиться к списку-образу, полученному
        по средствам метода subList, и обратиться к списку-образу получим ->
        Exception in thread "main" java.util.ConcurrentModificationException !!!
        */
        first_list.add(new SimpleObject("Indira",68));
        for (SimpleObject sop_2: another_list) {
            System.out.println(sop_2);
        }
    }
}
