package Less_7_ListMethods_Chap_1;
/*
Тестируем и запоминаем метод *.add() и *.addAll()
*/
import java.util.ArrayList;
import java.util.List;

/*
void add(int index, E obj): добавляет в список по индексу index объект obj

boolean addAll(int index, Collection<? extends E> col): добавляет в список по индексу index
все элементы коллекции col. Если в результате добавления список был изменен, то возвращается true,
иначе возвращается false
*/
public class Less_7_List_Step2_Add {
    public static void main(String[] args) {
        List<Integer> myArr = new ArrayList<>();
        myArr.add(23);
        myArr.add(13);
        myArr.add(33);
        myArr.add(24);
        System.out.println(myArr);
        // Добавили весь предыдущий список в текущий и добавили элемент на конкретное место
        List<Integer> mySyntexArr = new ArrayList<>(myArr);
        /*
        !!! Если в списке(коллекции) элементов, например, как у нас, 4-и т.е. заняты позиции 0,1,2,3,
        то мы можем вставлять либо элемент, либо другой список, только на места соответствующие размеру
        списка и +1, если попытаться вставить элемент на *.size() + 2, то будет выброшено исключение,
        оно и понятно, алгоритм расширения листа вроде бы работает по-другому.
        */
        mySyntexArr.add(myArr.size(),56);
        System.out.println(mySyntexArr);
        // А теперь добавили в список на конкретное место другой список, результаты в консоли.
        List<Integer> myBigTest = new ArrayList<>();
        myBigTest.add(23);
        myBigTest.add(2);
        myBigTest.add(234);
        myBigTest.add(88);
        // Добавляем один список в другой и возвращаем результат в виде true/false
        boolean yes_or_no = myBigTest.addAll(myBigTest.size()-2,mySyntexArr);
        System.out.println(myBigTest);
        System.out.println(yes_or_no);
    }
}
