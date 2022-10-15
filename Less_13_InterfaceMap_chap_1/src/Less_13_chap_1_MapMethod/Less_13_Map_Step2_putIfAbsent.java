package Less_13_chap_1_MapMethod;
/*
Коллекция несортированная, порядок добавления не сохраняется, формат Ключ-Значение
*/
import java.util.HashMap;
import java.util.Map;

public class Less_13_Map_Step2_putIfAbsent {
    public static void main(String[] args) {
        Map<Integer, String> passport_base = new HashMap<>();
        // Помещаем элементы в Map
        passport_base.put(1232,"Ахмад");
        passport_base.put(6435,"Асланбек");
        passport_base.put(18425,"Асхат");
        passport_base.put(12227,"Кадир");
        passport_base.put(9532,"Фируза");
        passport_base.put(13932,"Амина");
        System.out.println("Наш MAP -> " + passport_base);
        /*
        Метод *.putIfAbsent() позволяет проверить есть ли в базе (Map) введенный ключ,
        если есть, элемент не будет добавлен, если нет добавляем.
        */
        passport_base.putIfAbsent(18425,"Израиль"); // Проверяем ключ перед добавлением - дубликат, не добавляем
        passport_base.putIfAbsent(25835,"Израиль"); // Оригинальный ключ - добавляем
        System.out.println("Наш MAP -> " + passport_base);

    }
}
