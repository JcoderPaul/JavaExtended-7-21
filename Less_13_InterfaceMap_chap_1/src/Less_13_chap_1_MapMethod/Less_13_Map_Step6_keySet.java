package Less_13_chap_1_MapMethod;
/*
Метод возвращает множество ключей в коллекции Map
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Less_13_Map_Step6_keySet {
    public static void main(String[] args) {
        Map<Integer, String> passport_base = new HashMap<>();
        // Помещаем элементы в Map
        passport_base.put(134,"Жаур Быгыр");
        passport_base.put(6545,"Эрым Гурым");
        passport_base.put(993145,"Эрым Гурым");
        passport_base.put(1455,"Нгы Рунам");
        passport_base.put(16727,"Танзар Шапак");
        passport_base.put(1455,"Калина Тупир"); // Затирает ранний
        passport_base.put(16727,"Арагу Рам"); // Затирает ранний
        passport_base.put(7284,"Арагу Рам");
        passport_base.put(9242,"Калас Салар");
        passport_base.put(13562,"Сорус Рымычнак");
        System.out.println("Наш MAP -> " + passport_base);
        System.out.println("Размер базы MAP -> " + passport_base.size());
        /*
        Метод *.containsKey() позволяет извлечь все значения ключей из Map и поместить в коллекцию
        типа Set
        */
        Set<Integer> key_of_passport_base = passport_base.keySet();
        System.out.println("Набор наших ключей из коллекции MAP -> " + key_of_passport_base);
        System.out.println("Размер базы оригинальных ключей SET -> " + key_of_passport_base.size());
    }
}
