package Less_7_ListMethods_Chap_1;

import Less_7_ListMethods_Chap_1.MyObject.FilmDirector;

import java.util.ArrayList;
import java.util.List;
/*
 - E remove(int index): удаляет объект из списка по индексу index, возвращая при этом удаленный объект.
 - E remove(Object element): boolean

 Если мы пытаемся удалить ссылку на самописный объект у которого не перезаписан метод equals, получится
 интересный эффект (помним список хранит не объекты, а ссылки)
*/
public class Less_7_List_Step5_Remove {
    public static void main(String[] args) {
        List<String> str_list = new ArrayList<>();
        str_list.add("Горох");
        str_list.add("Зеленый");
        str_list.add("Не");
        str_list.add("Кукуруза");
        str_list.add("Наесться");
        str_list.add("Можно");
        str_list.add("И");
        str_list.add("От");
        str_list.add("Пуза");

        System.out.println(str_list);
        System.out.println(str_list.size());

        str_list.remove("Горох"); // Удаляем объект по содержимому 'Горох' в данном примере index - 0
        str_list.remove(5); // Удалям объект по индексу 'И'

        System.out.println(str_list);
        System.out.println(str_list.size());
//***************************************************************************************************************
        List<FilmDirector> fd_list = new ArrayList<>();
        fd_list.add(new FilmDirector("Clint Eastwood",92,1,2));
        fd_list.add(new FilmDirector("Martin Scorsese",79,1,2));
        fd_list.add(new FilmDirector("Kathryn Bigelow",70,1,1));
        fd_list.add(new FilmDirector("Jason Reitman",44,0,2));
        fd_list.add(new FilmDirector("Danny Boyle",65,1,1));
        for (FilmDirector fd: fd_list) {
            System.out.println(fd);
        }
        System.out.println("----------------------------- После 'удаления' -----------------------------");
        // Создаем копию Денни Бойла и пробуем его выпилить из списка по ссылке
        FilmDirector fd_dany = new FilmDirector("Danny Boyle",65,1,1);
        fd_list.remove(fd_dany);
        for (FilmDirector fd: fd_list) {
            System.out.println(fd);
        }
        // И ссылка там же, поскольку указывает на разные объекты и это легко проверить
        System.out.println(fd_dany == fd_list.get(4));

     }
}
