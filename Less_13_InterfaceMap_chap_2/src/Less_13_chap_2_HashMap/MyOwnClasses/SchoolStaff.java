package Less_13_chap_2_HashMap.MyOwnClasses;
/*
В данном классе мы переорпеделили метод ХЭШКОД - hashCode(), но НИЧЕГО не делали с Equals,
т.е. не переопределили.
*/
import java.util.Objects;

public class SchoolStaff {
    private String name;
    private String surname;
    private double salary;

    public SchoolStaff(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, salary);
    }

    @Override
    public String toString() {
        return "SchoolStaff{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
