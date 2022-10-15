package Less_8_List_Iterator;

import java.util.*;

public class Less_8_ListIterator_Step2 {
        public static void main(String[] args) {

            ArrayList<String> countries = new ArrayList<String>();
            countries.add("Germany");
            countries.add("France");
            countries.add("Italy");
            countries.add("Spain");
            System.out.println("------------------ ListIterator forward ------------------");
            ListIterator<String> listIter = countries.listIterator();

            while(listIter.hasNext()){
                System.out.println(listIter.next());
            }
            // сейчас текущий элемент - Spain, изменим значение этого элемента
            listIter.set("Portugal");
            System.out.println("------------------ ListIterator backward ------------------");
            // пройдемся по элементам в обратном порядке
            while(listIter.hasPrevious()){
                System.out.println(listIter.previous());
            }
            System.out.println("------------------ My 'countries' list by for ------------------");
            for (String str_prn: countries) {
                System.out.println(str_prn);
            }
        }
}
