package Less_7_ListMethods_Chap_1;

import Less_7_ListMethods_Chap_1.MyObject.SimpleObject;

import java.util.ArrayList;
import java.util.List;

public class Less_7_List_Step1 {
    public static void main(String[] args) {
        /* Вариантов создания списков несколько
        1 - ArrayList<Integer> myArray = new ArrayList<Integer>();
        */
        ArrayList<String> str_arr = new ArrayList<String>();
        str_arr.add("Извлекаем заданную строку");
        System.out.println(str_arr.get(0));
        /*
        2 - ArrayList<Integer> myArray = new ArrayList<>();
        3 - ArrayList<Integer> myArray = new ArrayList<>(180); - с заранее заданным Capacity не Size
        */
        ArrayList<Integer> str_int = new ArrayList<>(50);
        str_int.add(1);
        str_int.add(2); // Добавили 2-а элемента это размер - size не емкость capacity
        System.out.println(str_int.size());
        /*
        4 - List<Integer> myArray = new ArrayList<>(); - ссылка на интерфейс
        */
        List<Double> myList = List.of(23.54, 34.43, 67.54, 134.45); // Неизменяемый список
        /*
        5 - ArrayList<Integer> myArray = new ArrayList<>(AnotherList); - помещаем в уже существующий
                                                                         список другой список.
        */
        // Поместили неизменяемый список внутрь обычного списка, что сделало первый изменяемым
        ArrayList<Double> doubleArrayList = new ArrayList<>(myList);
        /*
        6 - ArrayList myArray = new ArrayList(); - без указания параметризации мы получаем список Object,
                                                   куда можем добавить практически любой объект.
        */
        ArrayList myArray = new ArrayList();
        myArray.add(4);
        myArray.add(4.4);
        myArray.add('D');
        myArray.add("Goal");
        myArray.add(new SimpleObject("Гера",34));
    }
}
