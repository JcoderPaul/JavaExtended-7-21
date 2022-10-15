package Less_9_LinkedList;

import Less_9_LinkedList.MyOwnClasses.Hero;

import java.util.LinkedList;
import java.util.ListIterator;

public class Less_9_LinkedList_Step1 {
    public static void main(String[] args) {
        Hero her_1 = new Hero("BatMan","DC");
        Hero her_2 = new Hero("SuperMan","DC");
        Hero her_3 = new Hero("Deadpool","MARVEL");
        Hero her_4 = new Hero("Weasel","MARVEL");
        Hero her_5 = new Hero("Haku","HAYAO MIYAZAKI");

        LinkedList<Hero> my_her_list = new LinkedList<>();
        my_her_list.add(her_1);
        my_her_list.add(her_2);
        my_her_list.add(her_3);
        my_her_list.add(her_4);
        my_her_list.add(her_5);
        // Используем ListIterator что бы вывести наш список на экран
        ListIterator<Hero> my_iterator_list = my_her_list.listIterator();
        while (my_iterator_list.hasNext()){
            System.out.println(my_iterator_list.next());
        }

    }
}
