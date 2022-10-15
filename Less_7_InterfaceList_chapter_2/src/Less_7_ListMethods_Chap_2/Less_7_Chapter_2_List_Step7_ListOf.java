package Less_7_ListMethods_Chap_2;

import Less_7_ListMethods_Chap_2.MyObject.SimpleObject;

import java.util.ArrayList;
import java.util.List;

public class Less_7_Chapter_2_List_Step7_ListOf {
    public static void main(String[] args) {
        List<SimpleObject> first_list = List.of(
                new SimpleObject("Piter",13),
                new SimpleObject("Theo",21),
                new SimpleObject("Sofiya",31),
                new SimpleObject("Rose",24),
                new SimpleObject("Karoline",17));
        System.out.println("------------------------ first_list ------------------------");
        for (Object object_print: first_list) {
            System.out.println(object_print);
        }
        /*
        Коллекция (список) созданные таким образом будут неизменяемыми и метод приведенный ниже:

        -> first_list.add(new SimpleObject("Sofiya",31));

        выкинет !!! Exception in thread "main" java.lang.UnsupportedOperationException !!!, так же еще
        несколько стандартных методов будут недоступны из-за особенностей list-a созданного методом
        List.of(E.....elements) и List.copyOf(Collection<E>)
        */
        ArrayList<SimpleObject> second_list = new ArrayList<>();
        second_list.add(new SimpleObject("Rafael",13));
        second_list.add(new SimpleObject("Donotelo",21));
        second_list.add(new SimpleObject("Sofiya",31));
        second_list.add(new SimpleObject("Rose",24));
        second_list.add(new SimpleObject("Laura",17));
        System.out.println("------------------------ lst_make_by_copy ------------------------");
        List<SimpleObject> lst_make_by_copy = List.copyOf(second_list);
        for (SimpleObject prt_lst: lst_make_by_copy) {
            System.out.println(prt_lst);
        }
        /*
        К списку созданному таким образом, т.е. через List.copyOf не будут применимы методы его
        модифицирующие например ->
                lst_make_by_copy.add(new SimpleObject("Sofiya",31));
        или
                lst_make_by_copy.remove(3);
        или
                lst_make_by_copy.set(2,new SimpleObject("Tallisa",12));
        компилятор выкинет:
                !!! Exception in thread "main" java.lang.UnsupportedOperationException !!!
        */
    }
}
