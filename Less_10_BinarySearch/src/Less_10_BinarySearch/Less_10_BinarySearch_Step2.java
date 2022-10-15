package Less_10_BinarySearch;

import Less_10_BinarySearch.MyOwnClasses.CarDriver;

import java.util.*;

public class Less_10_BinarySearch_Step2 {
    public static void main(String[] args) {
        List<CarDriver> my_own_garage = new ArrayList<>();
        my_own_garage.add(new CarDriver(2,"Николай", 2342.5));
        my_own_garage.add(new CarDriver(4,"Василий", 4542.5));
        my_own_garage.add(new CarDriver(23,"Галина", 5642.5));
        my_own_garage.add(new CarDriver(6,"Георгий", 2356.5));
        my_own_garage.add(new CarDriver(76,"Татьяна", 2762.5));
        my_own_garage.add(new CarDriver(12,"Тимофей", 9422.5));
        my_own_garage.add(new CarDriver(67,"Тамара", 8256.5));
        System.out.println("--------------- 'my_own_garage' after *.shuffle() ---------------");
        Collections.shuffle(my_own_garage);
        for (CarDriver lst_prn: my_own_garage) {
            System.out.println(lst_prn);
        }
        System.out.println("--------------- 'my_own_garage' after *.sort(by 'id') ---------------");
        Collections.sort(my_own_garage);
        ListIterator<CarDriver> iter_for_sort = my_own_garage.listIterator();
        while (iter_for_sort.hasNext()){
            System.out.println(iter_for_sort.next());
        }
        System.out.println("--------------- find object in 'my_own_garage' by *.binarySearch() ---------------");
        CarDriver find_elem = new CarDriver(6,"Георгий", 2356.5);
        int find_ind = Collections.binarySearch(my_own_garage,find_elem);
        System.out.println(find_ind);
        System.out.println(Collections.binarySearch(my_own_garage,
                                        new CarDriver(15,"Элем", 7256.5)));
    }
}
