package Less_7_ListMethods_Chap_1;

import java.util.ArrayList;
import java.util.List;
/*
E get(int index): возвращает объект из списка по индексу index
*/
public class Less_7_List_Step3_Get {
    public static void main(String[] args) {
        List<Integer> myArr = new ArrayList<>();
        myArr.add(23);
        myArr.add(13);
        myArr.add(33);
        myArr.add(24);
        System.out.println(myArr.get(3));
        System.out.println("------------- Вывод в цикле -------------");
        for(int i = 0; i < myArr.size(); i++){
            System.out.println(myArr.get(i));
        }
    }
}
