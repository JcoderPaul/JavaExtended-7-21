package Less_13_chap_1_MapMethod;
/*
Коллекция несортированная, порядок добавления не сохраняется, формат Ключ-Значение
*/
import java.util.HashMap;
import java.util.Map;

public class Less_13_Map_Step3_Remove {
    public static void main(String[] args) {
        Map<Integer, String> passport_base = new HashMap<>();
        // Помещаем элементы в Map
        passport_base.put(1232,"John");
        passport_base.put(6435,"Phillipe");
        passport_base.put(18425,"Nora");
        passport_base.put(12227,"Talisa");
        passport_base.put(9532,"Frida");
        passport_base.put(13932,"Gerbert");
        System.out.println("Наш MAP -> " + passport_base);
        /*
        Метод *.remove() позволяет удалить элемент по ключу или по сочетанию (ключ, значение)
        */
        passport_base.remove(18425); // Удаляем элемент по ключу
        passport_base.remove(12227,"Talisa"); // Удаляем элемент из Map по паре (ключ-значение)
        System.out.println("Наш MAP -> " + passport_base);
    }
}
