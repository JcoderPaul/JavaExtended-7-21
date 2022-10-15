package Less_7_ListMethods_Chap_1;

import Less_7_ListMethods_Chap_1.MyObject.SimpleObject;
/*
Метод contains (Object) класса java.util.ArrayList возвращает значение true, если
список содержит указанный элемент.
*/
import java.util.ArrayList;
import java.util.List;

public class Less_7_List_Step7_Contains {
    public static void main(String[] args) {
        List<SimpleObject> so_list = new ArrayList<>();
        SimpleObject so_1 = new SimpleObject("Игорь",43);
        SimpleObject so_2 = new SimpleObject("Василий",13);
        SimpleObject so_3 = new SimpleObject("Дарья",23);
        SimpleObject so_4 = new SimpleObject("Татьяна",45);
        SimpleObject so_5 = new SimpleObject("Анатолий",67);
        so_list.add(so_1);
        so_list.add(so_2);
        so_list.add(so_3);
        so_list.add(so_4);
        so_list.add(so_5);
        /*
        Делаем три проверки наличие объекта в списке, нужно учесть, что метод equals у
        SimpleObject переопределен, в противном случае результат был бы немного другим.
        */
        System.out.println(so_list.contains(so_2));
        System.out.println(so_list.contains(new SimpleObject("Анатолий",67)));
        System.out.println(so_list.contains(new SimpleObject("Константин",17)));
    }
}
