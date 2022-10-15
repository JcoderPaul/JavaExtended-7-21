package Less_7_ListMethods_Chap_2;
/*
The toArray() method of ArrayList is used to return an array containing all the elements in
ArrayList in the correct order.

Syntax: -> public Object[] toArray()
             or
           public <T> T[] toArray(T[] a)
Parameters: This method either accepts no parameters or it takes an array T[] a as parameter
which is the array into which the elements of the list are to be stored, if it is big enough;
otherwise, a new array of the same runtime type is allocated for this purpose.
Return Value: The function returns an array containing all the elements in this list.
*/
import Less_7_ListMethods_Chap_2.MyObject.SimpleObject;

import java.util.ArrayList;

public class Less_7_Chapter_2_List_Step6_toArray {
    public static void main(String[] args) {
        ArrayList<SimpleObject> first_list = new ArrayList<>();
        first_list.add(new SimpleObject("Piter",13));
        first_list.add(new SimpleObject("Theo",21));
        first_list.add(new SimpleObject("Sofiya",31));
        first_list.add(new SimpleObject("Rose",24));
        first_list.add(new SimpleObject("Karoline",17));
        // Создаем массив элементов Object
        System.out.println("------------------------ Object[] my_array ------------------------");
        Object[] my_array = first_list.toArray();
        for (Object object_print: my_array) {
            System.out.println(object_print);
        }
        System.out.println("------------------------ SimpleObject[n > first_list.size] so_array ------------------------");
        // Уже заранее определяем на базе какого класса <параметризируем> будет создан массив из списка
        SimpleObject[] so_array = first_list.toArray(new SimpleObject[8]);
        for (SimpleObject so_print: so_array) {
            System.out.println(so_print);
        }
        /*
        В примере выше мы указали размер массива больше чем длина списка, и получили пустые ячейки null
        в данном примере просто указываем размер массива 0 и получаем нужный результат.
        */
        System.out.println("------------------------ SimpleObject[0] so_array ------------------------");
        SimpleObject[] so_array_2 = first_list.toArray(new SimpleObject[0]);
        for (SimpleObject so_print_2: so_array_2) {
            System.out.println(so_print_2);
        }
    }

}
