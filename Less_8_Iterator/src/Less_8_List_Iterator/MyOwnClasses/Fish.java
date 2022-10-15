package Less_8_List_Iterator.MyOwnClasses;

import java.util.Objects;

public class Fish {
    private String name;
    private double avg_weight;
    private String habitat;

    public Fish(String name, double avg_weight, String habitat) {
        this.name = name;
        this.avg_weight = avg_weight;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Fish {" +
                "name= '" + name + '\'' +
                ", avg_weight= " + avg_weight +
                ", habitat= '" + habitat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fish fish = (Fish) o;
        return Double.compare(fish.avg_weight, avg_weight) == 0 && Objects.equals(name, fish.name) && Objects.equals(habitat, fish.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avg_weight, habitat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvg_weight() {
        return avg_weight;
    }

    public void setAvg_weight(double avg_weight) {
        this.avg_weight = avg_weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
