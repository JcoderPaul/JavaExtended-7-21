package Less_17_chap_2_TreeSet.MyOwnClasses;

import java.util.Objects;

/*
Делаем сразу final, для возможности использовать в качестве "идеального" ключа
переопределяем все методы для сортировки и вывода на экран.
*/
public final class SuperHero implements Comparable<SuperHero>{

    private final String name;
    private final int super_power_level;

    public SuperHero(String name, int super_power_level) {
        this.name = name;
        this.super_power_level = super_power_level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperHero superHero = (SuperHero) o;
        return super_power_level == superHero.super_power_level && Objects.equals(name, superHero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, super_power_level);
    }

    @Override
    public String toString() {
        return "SuperHero {" +
                "name= '" + name + '\'' +
                ", super_power_level= " + super_power_level +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getSuper_power_level() {
        return super_power_level;
    }

    @Override
    public int compareTo(SuperHero superHero) {
        if(this.super_power_level == superHero.super_power_level){
            return this.name.compareTo(superHero.name);
        } else if (this.super_power_level > superHero.super_power_level){
            return 1;
        } else {
            return -1;
        }
    }
}
