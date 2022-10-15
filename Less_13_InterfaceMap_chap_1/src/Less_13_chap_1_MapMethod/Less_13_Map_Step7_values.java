package Less_13_chap_1_MapMethod;
/*
Метод возвращает множество элементов под ключами, без ключей, содержащихся в коллекции Map
*/
import java.util.*;

public class Less_13_Map_Step7_values {
    public static void main(String[] args) {
        Map<Integer, String> passport_base = new HashMap<>();
        // Помещаем элементы в Map
        passport_base.put(134,"Жаур Быгыр");
        passport_base.put(6545,"Эрым Гурым");
        passport_base.put(993145,"Эрым Гурым");
        passport_base.put(1455,"Нгы Рунам");
        passport_base.put(16727,"Арагу Рам");
        passport_base.put(7284,"Арагу Рам");
        passport_base.put(9242,"Калас Салар");
        passport_base.put(13562,"Сорус Рымычнак");
        System.out.println("Наш MAP -> " + passport_base);
        /*
        Метод *.values() позволяет извлечь значения всех элементов из Map без значения ключей
        и поместить в коллекцию, например, ArrayList, т.е. повтор элементов возможен.
        */
        List<String> element_of_passport_base = new ArrayList(passport_base.values());
        System.out.println("Элементы базы MAP -> " + element_of_passport_base);
    }
}
