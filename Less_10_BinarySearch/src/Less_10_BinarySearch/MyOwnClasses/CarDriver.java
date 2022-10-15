package Less_10_BinarySearch.MyOwnClasses;

import java.util.Objects;
/*
Для правильной перезаписи метода *.compareTo() необходимо параметризировать
подписанный интерфейс нашим самописным классом -> public class T implements Comparable<T>
и тогда легко можно будет перезаписать -> public int compareTo(T t)
что позволит в основном коде использовать методы класса Collections (sort, binarySearch, ...)
*/
public class CarDriver implements Comparable<CarDriver>{
    private int id;
    private String name;
    private double salary;

    public CarDriver(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(CarDriver car_drv) {
        if(this.id == car_drv.id) {
            return 0;
        } else if (this.id > car_drv.id) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "CarDriver {" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", salary= " + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDriver carDriver = (CarDriver) o;
        return id == carDriver.id && Double.compare(carDriver.salary, salary) == 0 && Objects.equals(name, carDriver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
