package Less_7_ListMethods_Chap_1;

import Less_7_ListMethods_Chap_1.MyObject.*;
/*
- int indexOf(Object obj): возвращает индекс первого вхождения объекта obj в список.
Если объект не найден, то возвращается -1

- метод clear() класса java.util.ArrayList удаляет все элементы из списка к которому его применили.
Список будет пустым после возврата этого вызова.
*/
import java.util.ArrayList;
import java.util.List;

public class Less_7_List_Step6_Clear_IndexOf {
    public static void main(String[] args) {
        List<Actor> actors_list = new ArrayList<>();
        Actor act_1 = new Actor("Jeff Bridges",72,1,1);
        Actor act_2 = new Actor("Leonardo DiCaprio",47,0,2);
        Actor act_3 = new Actor("George Clooney",61,0,2);
        Actor act_4 = new Actor("Jamie Foxx",54,1,1);
        Actor act_5 = new Actor("Sean Penn",62,1,1);
        actors_list.add(act_1);
        actors_list.add(act_2);
        actors_list.add(act_3);
        actors_list.add(act_4);
        actors_list.add(act_5);

        System.out.println("Размер списка -> " + actors_list.size());
        for (Actor act: actors_list) {
            System.out.println(act);
        }
        System.out.println("----------------------------- Ищем объект (ссылку на объект) в списке -----------------------------");
        int index_res = actors_list.indexOf(act_4);
        // Выводим индекс объекта который есть в списке результат int
        System.out.println(index_res);
        int index_res_2 = actors_list.indexOf(new Actor("Kate Winslet",47,1,3));
        // Выводим индекс объекта которого нет в списке (-1 если нет такого)
        System.out.println(index_res_2);
        /*
        Обратить нужно внимание на переопределение метода *.equals(Object o) в классе Actor, если этого
        не делать то сравниваться будут только ссылки на объекты т.е. эквивалент '=='. Однако, можно
        перепрописать условия сравнения объектов и получить более приемлемый результат, как в примере с
        "Leonardo DiCaprio", мы как минимум два раза создавали объект с одинаковыми параметрами, но метод
        *.indexOf() воспринимает их, как равные и выдает местоположение ссылки в списке.
        */
        Actor act_6 = new Actor("Leonardo DiCaprio",47,0,2);
        int index_res_3 = actors_list.indexOf(act_6);
        // Выводим индекс объекта которого нет в списке (-1 если нет такого)
        System.out.println(index_res_3);

        System.out.println("----------------------------- После 'удаления' -----------------------------");
        // Создаем копию Денни Бойла и пробуем его выпилить из списка по ссылке
        actors_list.clear();
        System.out.println("Размер списка -> " + actors_list.size());
        // На экране будет пустота, т.к. список ничего не содержит
        for (Actor act: actors_list) {
            System.out.println(act);
        }
    }
}
