package Less_9_LinkedList;

import Less_9_LinkedList.MyOwnClasses.Hero;

import java.util.LinkedList;
import java.util.ListIterator;

public class Less_9_LinkedList_Step2_Training {
    public static void main(String[] args) {
        Hero her_1 = new Hero("BatMan","DC");
        Hero her_2 = new Hero("SuperMan","DC");
        Hero her_3 = new Hero("Deadpool","MARVEL");
        Hero her_4 = new Hero("Weasel","MARVEL");
        Hero her_5 = new Hero("Haku","HAYAO MIYAZAKI");
        Hero her_6 = new Hero("Sauron","THE LORD OF THE RINGS");
        Hero her_7 = new Hero("Howl","DIANA WYNNE JONES");

        LinkedList<Hero> my_her_list = new LinkedList<>();
        my_her_list.add(her_1);
        my_her_list.add(her_2);
        my_her_list.add(her_3);
        my_her_list.add(her_4);
        my_her_list.add(her_5);
        System.out.println("----------------------- my_her_list 5-ть элементов -----------------------");
        ListIterator<Hero> list_iter = my_her_list.listIterator();
        while (list_iter.hasNext()){
            System.out.println(list_iter.next());
        }
        System.out.println("----------------------- my_her_list 6-ть элементов -----------------------");
        my_her_list.add(2,her_6);
        my_her_list.add(her_7);
        my_her_list.remove(new Hero("Weasel","MARVEL"));
        int i = 0;
        for (Hero h_print: my_her_list){
            i += 1;
            System.out.println(i + " -> " + h_print);
        }
        System.out.println("----------------------- *.get() -----------------------");
        System.out.println(my_her_list.get(4));
    }
}
