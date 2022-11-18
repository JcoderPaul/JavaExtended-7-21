package Less_CollectionsTasks;
/*
Написать метод countUnique, который принимает список целочисленных
значений в качестве параметра и возвращает количество уникальных целых
чисел в этом списке. При получении пустого списка метод должен возвращать 0
Пример:[-3, 5, -8, 23, 5, -3, 53, 2, 51, -8, 3, 9] -> На экран (вернет): 9
*/
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Less_CollectionsTasks_2 {
    public static void main(String[] args) {
        List<Integer> listForWork = List.of(-3, 5, -8, 23, 5, -3, 53, 2, 51, -8, 3, 9);
        List<Integer> listOfNull = List.of();
        System.out.println(countUnique(listForWork));
        System.out.println(countUnique(listOfNull));
        System.out.println("----------------------------------------");
        System.out.println(countUniqueTwo(listForWork));
        System.out.println(countUniqueTwo(listOfNull));
    }

    private static int countUnique(List<Integer> list){
        Set<Integer> myResSet = new HashSet<>(list);
        return myResSet.size();
    }

    private static int countUniqueTwo(List<Integer> list){
        // То же что и в первом методе, но более короткий синтаксис.
        return new HashSet<>(list).size();
    }
}
