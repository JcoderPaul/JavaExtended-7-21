package Less_7_ListMethods_Chap_2.MyObject;

import java.util.Objects;

public class Actor {
    private String name;
    private int age;
    private int countOfOscar;
    private int nomination;

    public Actor(String name, int age, int countOfOscar, int nomination) {
        this.name = name;
        this.age = age;
        this.countOfOscar = countOfOscar;
        this.nomination = nomination;
    }

    @Override
    public String toString() {
        return "Actor {" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", countOfOscar= " + countOfOscar +
                ", nomination= " + nomination +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return age == actor.age &&
               countOfOscar == actor.countOfOscar &&
               nomination == actor.nomination &&
               Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, countOfOscar, nomination);
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

