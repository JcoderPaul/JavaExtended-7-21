package Less_7_ListMethods_Chap_1;

import java.util.ArrayList;
import java.util.List;
/*
E set(int index, E obj): присваивает значение объекта obj элементу, который находится по индексу index.
*/
public class Less_7_List_Step4_Set {
    public static void main(String[] args) {
        List<Integer> myArr = new ArrayList<>();
        myArr.add(23);
        myArr.add(13);
        myArr.add(33);
        myArr.add(24);
        System.out.println(myArr);
        System.out.println("---------------- Меняем элемент ----------------");
        myArr.set(1,345); // Меняем элемент с index - 1 (у нас это 13) на 345
        System.out.println(myArr);
    }
}
