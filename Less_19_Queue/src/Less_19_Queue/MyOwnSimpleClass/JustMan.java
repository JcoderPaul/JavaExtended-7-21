package Less_19_Queue.MyOwnSimpleClass;

import java.util.Objects;

public class JustMan {
    private String name;
    private int age;

    public JustMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "JustMan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JustMan justMan = (JustMan) o;
        return age == justMan.age && Objects.equals(name, justMan.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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
}
