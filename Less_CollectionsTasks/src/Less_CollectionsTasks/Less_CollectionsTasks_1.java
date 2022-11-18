package Less_CollectionsTasks;
/*
Написать метод, который принимает целочисленный список и
возвращает целочисленный список только с нечетными значениями.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Less_CollectionsTasks_1 {
    public static void main(String[] args) {
        List<Integer> myList = List.of(4, 5, -23, 65, -34, 8, 98, 31, 51);

        System.out.println("Было : " + myList);
        System.out.println("Стало без четных элементов : " + removeEven(myList));
        System.out.println("Стало без четных элементов : " + removeEvenTwo(myList));
    }
    /*
    Не знаю на сколько это правильно, но бытует мнение в авторитетных
    кругах, что изменять исходный объект для получения требуемого
    результата не всегда хорошо (оправдано). Лучшей практикой является
    работа с копией объекта и ее преобразование. А возвращаемый методом
    объект должен быть новым, а не измененным старым.
    */
    private static List<Integer> removeEven(List<Integer> listForFilter){
        List<Integer> listResult = new ArrayList<>();
        for (int i = 0; i < listForFilter.size(); i++){
            if(listForFilter.get(i) % 2 != 0){
                listResult.add(listForFilter.get(i));
            }
        }
        return listResult;
    }
    /*
    Вариант реализации при помощи Stream API, методы стрима
    не изменяют объект с которым работают, а пропускают через
    его элементы и на выходе мы получаем требуемое нечто, но
    исходный объект, например List не меняется.
    */
    private static List<Integer> removeEvenTwo(List<Integer> listForFilter){
        List<Integer> listResult = listForFilter. // Берем входящий (из аргументов метода) список
                                        stream(). // Создаем на нем стрим
             filter(Integer -> Integer % 2 != 0). // Фильтруем предикатом
                    collect(Collectors.toList()); // Загоняем в новую коллекцию (новый listResult)

        return listResult;
    }
}
