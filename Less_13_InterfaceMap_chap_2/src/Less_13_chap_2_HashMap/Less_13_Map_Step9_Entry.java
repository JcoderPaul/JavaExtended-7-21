package Less_13_chap_2_HashMap;
/*
public Set<Map.Entry<K,V>> entrySet(): Получить коллекцию (набор наборов) всех объектов пар ключ-значение
в коллекции MAP. Метод нужен для возврата коллекции. Коллекция хранит объекты. Класс создания объекта имеет
два атрибута, а именно ключ и значение, пара "ключ-значение".

Entry является статическим внутренним классом Map.

При создании объекта Map одновременно создается объект Entry для записи взаимосвязи сопоставления между
ключами и значениями.
*/
import java.util.*;

public class Less_13_Map_Step9_Entry {
    public static void main(String[] args) {
        // Создаем объект HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("Ключ 1", "Значение 1");
        map.put("Ключ 2", "Значение 2");
        map.put("Ключ 3", "Значение 3");

        // Получаем коллекцию объектов
        Set<Map.Entry<String, String>> entries = map.entrySet();

        // Используем for для обхода
        for (Map.Entry<String, String> s : entries) {
            // Выводим объект s напрямую
            System.out.println(s);

            // Либо через метод класса Entry, чтобы отдельно выделить ключ и значение
            String key = s.getKey();        // Получаем ключ
            String value = s.getValue();    // Получаем значение
            System.out.println(key + " < = > " + value);    // Вывод значения ключа
        }
        System.out.println("----------------------------------------------------------------------------------");
        // Используем while для обхода при помощи итератора в коллекции
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next);

            String key = next.getKey();        // Получаем ключ
            String value = next.getValue();    // Получаем значение
            System.out.println(key + " < = > " + value);    // Вывод значения ключа
        }
    }
}
