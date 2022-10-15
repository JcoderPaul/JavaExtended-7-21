package Less_10_BinarySearch;

import Less_10_BinarySearch.MyOwnClasses.CarDriver;

import java.util.Arrays;

/*
Бинарный поиск работает и для обычного массива, применяется другой класс Arrays
*/
public class Less_10_BinarySearch_Step3 {
    public static void main(String[] args) {
        CarDriver[] carDrivers = {
                    new CarDriver(2,"Николай", 2342.5),
                    new CarDriver(4,"Василий", 4542.5),
                    new CarDriver(23,"Галина", 5642.5),
                    new CarDriver(6,"Георгий", 2356.5),
                    new CarDriver(76,"Татьяна", 2762.5),
                    new CarDriver(12,"Тимофей", 9422.5),
                    new CarDriver(67,"Тамара", 8256.5)};
        Arrays.sort(carDrivers);
        System.out.println("--------------- массив 'carDrivers' после *.sort() ---------------");
        for (CarDriver cdr: carDrivers) {
            System.out.println(cdr);
        }
        System.out.println("--------------- ищем элемент в 'carDrivers' ---------------");
        int fnd_ind = Arrays.binarySearch(carDrivers,new CarDriver(76,"Татьяна", 2762.5));
        System.out.println(fnd_ind);
    }
}
