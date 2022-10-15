package Less_13_chap_2_HashMap.MyOwnClasses;
/*
Пример имутабельного класса, у которого нет наследников и все поля prv и final для работы в качестве ключа
*/
import java.util.Objects;

public final class SolidImmutableHero {
    private final String name_hero;
    private final double cool_level;

    public SolidImmutableHero(String name_hero, double cool_level) {
        this.name_hero = name_hero;
        this.cool_level = cool_level;
    }

    @Override
    public String toString() {
        return "SolidImmutableHero{" +
                "name_hero='" + name_hero + '\'' +
                ", cool_level=" + cool_level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolidImmutableHero that = (SolidImmutableHero) o;
        return Double.compare(that.cool_level, cool_level) == 0 && Objects.equals(name_hero, that.name_hero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name_hero, cool_level);
    }

    public String getName_hero() {
        return name_hero;
    }

    public double getCool_level() {
        return cool_level;
    }
}
