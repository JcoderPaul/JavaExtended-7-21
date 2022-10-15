package Less_13_chap_1_MapMethod;
/*
Коллекция несортированная, порядок добавления не сохраняется, формат Ключ-Значение
*/
import java.util.HashMap;
import java.util.Map;

public class Less_13_Map_Step1 {
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
        Ключ уникальный элемент, если его дублировать при введении другого элемента, то
        первоначальное значение под ключом будет переписано. Значение элемента под ключом
        может дублироваться, но не ключ!!!
        */
        passport_base.put(18425,"Израиль"); // Асхат -> Израиль, ключ не изменился
        passport_base.put(12227,"Илия"); // Кадир -> Илия, ключ не изменился
        passport_base.put(82457,"Асланбек");
        System.out.println("Наш MAP -> " + passport_base);
        /*
        Методы извлечения похожи на стандартные коллекционные, но по ключу
        */
        System.out.println(passport_base.get(6435));
        System.out.println(passport_base.get(1122334)); // Если ключа в базе нет вернется null
        /*
        И ключ и значение под ключем могут быть null
        */
        passport_base.put(null,"Илия");
        passport_base.put(83126,null);
        passport_base.put(null,null);
        System.out.println("Наш MAP -> " + passport_base);
    }
}
