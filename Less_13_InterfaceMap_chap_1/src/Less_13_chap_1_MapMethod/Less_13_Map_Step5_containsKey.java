package Less_13_chap_1_MapMethod;

import java.util.HashMap;
import java.util.Map;

public class Less_13_Map_Step5_containsKey {
    public static void main(String[] args) {
        Map<Integer, String> passport_base = new HashMap<>();
        // Помещаем элементы в Map
        passport_base.put(134,"Жаур Быгыр");
        passport_base.put(6545,"Эрым Гурым");
        passport_base.put(1455,"Нгы Рунам");
        passport_base.put(16727,"Арагу Рам");
        passport_base.put(9242,"Калас Салар");
        passport_base.put(13562,"Сорус Рымычнак");
        System.out.println("Наш MAP -> " + passport_base);
        /*
        Метод *.containsKey() позволяет определить есть ли в Map элемент с определенным ключом
        есть - true, нет - false. Состояния коллекции не меняет.
        */
        System.out.println(passport_base.containsKey(16727)); // true
        System.out.println(passport_base.containsKey(3358779)); // false
        System.out.println("Наш MAP -> " + passport_base);
    }
}
