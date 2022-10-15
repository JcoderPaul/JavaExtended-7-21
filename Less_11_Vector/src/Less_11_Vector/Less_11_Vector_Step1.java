package Less_11_Vector;

import java.util.Vector;

public class Less_11_Vector_Step1 {
    public static void main(String[] args) {
        Vector<String> str_vector = new Vector<>();
        str_vector.add("Барий");
        str_vector.add("Хром");
        str_vector.add("Ванадий");
        str_vector.add("Технеций");
        System.out.println(str_vector);

        System.out.println(str_vector.firstElement());
        System.out.println(str_vector.lastElement());
        int i_for_erase = 3;
        System.out.println("Удалили элемент -> " + i_for_erase);
        str_vector.remove(i_for_erase);
        System.out.println("Вектор после изменений -> " + str_vector);

        int j_for_get = 2;
        System.out.println("Элемент " + j_for_get +
                           " в коллекции класса Vector -> " + str_vector.get(j_for_get));

    }
}
