package Less_10_BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Less_10_BinarySearch_Step1 {
    public static void main(String[] args) {
        List<Integer> for_sort_and_search = new ArrayList<>();
        for_sort_and_search.add(-7);
        for_sort_and_search.add(-17);
        for_sort_and_search.add(-67);
        for_sort_and_search.add(3);
        for_sort_and_search.add(7);
        for_sort_and_search.add(57);
        for_sort_and_search.add(127);
        for_sort_and_search.add(457);
        for_sort_and_search.add(0);
        System.out.println("--------------- 'for_sort_and_search' after *.shuffle() ---------------");
        // Перемешаем для красоты
        Collections.shuffle(for_sort_and_search);
        // Выводим на экран
        ListIterator<Integer> my_iter = for_sort_and_search.listIterator();
        while (my_iter.hasNext()){
            System.out.println(my_iter.next());
        }
        System.out.println("--------------- 'for_sort_and_search' after *.sort() ---------------");
        /*
        Бинарный поиск требует обязательной сортировки, т.к. происходит секторальный поиск
        с постоянным делением исследуемого списка пополам до нахождения требуемого элемента
        */
        Collections.sort(for_sort_and_search);
        for (Integer int_for_prn: for_sort_and_search) {
            System.out.println(int_for_prn);
        }
        System.out.println("--------------- find element in 'for_sort_and_search' ---------------");
        /*
        Результат бинарного поиска в массиве (листе) это индекс найденного элемента (или не найденного),
        если элемент не будет найден, результат будет предполагаемое место расположения со знаком '-'.
        См. пример ниже.
        */
        int find_index = Collections.binarySearch(for_sort_and_search, 57);
        System.out.println("Элемент есть в списке и находится на -> " + find_index);
        int find_index_2 = Collections.binarySearch(for_sort_and_search, 574);
        System.out.println("Элемента нет в списке он мог находиться на -> " + find_index_2);
    }
}
