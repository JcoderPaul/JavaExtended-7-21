package Less_CollectionsTasks;

import java.util.*;

/*
Написать метод isUnique, который принимает Map<String, String> myBase,
и возвращает true, если каждому ключу 'K' соответствует свое уникальное
значение 'V'.
Например:
{Malcolm = Stone, Sanara = Cuesta, Douglas = Lind, Timeus = Rodderick} <-> true
{Richard = Parker, Mary = Parker, Monica = Fury, Nicholas = Fury} <-> false
*/
public class Less_CollectionsTasks_3 {
    public static void main(String[] args) {
        // Способ заполнения Map, аналогичный List.of()
        Map<String, String> trueMap = Map.of(
                "Malcolm", "Stone",
                "Sanara", "Cuesta",
                "Douglas", "Lind",
                "Timeus", "Rodderick");
        Map<String, String> falseMap = Map.of(
                "Richard", "Parker",
                "Mary", "Parker",
                "Monica", "Fury",
                "Nicholas", "Fury");
        /*
        Особенность о которой было упомянуто в одном
        уроке и только у одного учителя, пока до книг
        я не добрался. И так, мы можем сделать так:
         */
        // Список всех ключей (они оригинальны)
        List<String> keysOfMap = new ArrayList<>(trueMap.keySet());
        System.out.println(keysOfMap);
        // Список значений под ключами (могут быть и не оригинальными)
        List<String> volOfMap = new ArrayList<>(trueMap.values());
        System.out.println(volOfMap);
        // Список всех сочетаний ключ - значение
        List<Map.Entry> entryOfMap = new ArrayList<>(trueMap.entrySet());
        System.out.println(entryOfMap);
        /*
        Эти интересные методы позволяют нам много чего делать с данными
        нашей Map, работать, как с их комбинацией, так и с их сочетанием
        и самое главное по одиночке.
        */
        System.out.println("--------------------- *.isUnique() ---------------------");
        System.out.println(isUnique(trueMap));
        System.out.println(isUnique(falseMap));
        System.out.println("--------------------- *.isUniqueTwo() ---------------------");
        System.out.println(isUniqueTow(trueMap));
        System.out.println(isUniqueTow(falseMap));
    }

    private static boolean isUnique(Map<String, String> mapForTest){
        // Шаг 1. Определили размер исходного Map
        int sizeOfOriginal = mapForTest.size();
        /*
        Шаг 2. Создали Set и опустили в него содержимое значений исходного Map,
               что дало возможность отсеять дублирующие друг-друга значения.
        */
        Set<String> newSetForTest = new HashSet<>(mapForTest.values());
        /*
        Шаг 3. Определили размер созданного Set-а, если размер исходного Map-а
        совпадет с размером получившегося Set-а, то все значения под ключами
        оригинальны и повторений нет (как в Map<String, String> trueMap), если
        размер Set-а меньше, есть дубликаты (как в Map<String, String> falseMap).
        */
        int sizeOfNewSet = newSetForTest.size();
        // Шаг 4. Сравниваем размеры коллекций
        return sizeOfOriginal == sizeOfNewSet;
    }

    private static boolean isUniqueTow(Map<String, String> mapForTest){
        // Те же шаги, что и в первом методе, только короче синтаксис
        return mapForTest.size() == new HashSet<>(mapForTest.values()).size();
    }
}