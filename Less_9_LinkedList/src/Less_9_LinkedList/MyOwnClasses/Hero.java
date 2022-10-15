package Less_9_LinkedList.MyOwnClasses;

import java.util.Objects;

public class Hero {
    private String name;
    private String universe;

    public Hero(String name, String universe) {
        this.name = name;
        this.universe = universe;
    }

    @Override
    public String toString() {
        return "Hero {" +
                "name= '" + name + '\'' +
                ", universe= '" + universe + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return Objects.equals(name, hero.name) && Objects.equals(universe, hero.universe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, universe);
    }

    public String getName() {
        return name;
    }

    public String getUniverse() {
        return universe;
    }
}
