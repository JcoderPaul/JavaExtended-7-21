package Less_7_ListMethods_Chap_1.MyObject;

public class FilmDirector {
    private String name;
    private int age;
    private int countOfOscar;
    private int nomination;

    public FilmDirector(String name, int age, int countOfOscar, int nomination) {
        this.name = name;
        this.age = age;
        this.countOfOscar = countOfOscar;
        this.nomination = nomination;
    }

    @Override
    public String toString() {
        return "FilmDirector {" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", countOfOscar= " + countOfOscar +
                ", nomination= " + nomination +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCountOfOscar() {
        return countOfOscar;
    }

    public void setCountOfOscar(int countOfOscar) {
        this.countOfOscar = countOfOscar;
    }
}

