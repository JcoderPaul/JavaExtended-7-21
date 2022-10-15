package Less_7_ListMethods_Chap_2;

import Less_7_ListMethods_Chap_2.MyObject.SimpleObject;
/*
Следует помнить, что метод Arrays.asList() возвращает немодифицируемый List, причём эта
немодифицируемость сохраняется при сериализации/восстановлении списка.
*/
import java.util.Arrays;
import java.util.List;

public class Less_7_Chapter_2_List_Step1_asList {
    public static void main(String[] args) {
        SimpleObject so_1 = new SimpleObject("Игорь",43);
        SimpleObject so_2 = new SimpleObject("Василий",13);
        SimpleObject so_3 = new SimpleObject("Дарья",23);
        SimpleObject so_4 = new SimpleObject("Татьяна",45);
        SimpleObject so_5 = new SimpleObject("Анатолий",67);
        System.out.println("----------------------- Вывожу массив -----------------------");
        // Создаем массив и выводи на экран.
        SimpleObject [] so_obj_array = new SimpleObject[]{so_1, so_2, so_3, so_4, so_5};
        for (int i = 0; i < so_obj_array.length; i++){
            System.out.println(so_obj_array[i]);
        }
        System.out.println("----------------------- Вывожу List -----------------------");
        // Модифицируем наш массив в список
        List<SimpleObject> my_so_list = Arrays.asList(so_obj_array);
        for (SimpleObject sol: my_so_list) {
            System.out.println(sol);
        }
        System.out.println("----------------------- Меняю List и вывожу массив -----------------------");
        my_so_list.set(2,new SimpleObject("Роман",34));
        for (int i = 0; i < so_obj_array.length; i++){
            System.out.println(so_obj_array[i]);
        }
        System.out.println("----------------------- Меняю массив и вывожу список -----------------------");
        so_obj_array[3] = new SimpleObject("Фатима",21);
        for (SimpleObject sol_2: my_so_list){
            System.out.println(sol_2);
        }
    }
}
