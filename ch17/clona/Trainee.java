package gr.aueb.cf.ch17.clona;

import java.io.Serializable;
import java.util.Objects;

public class Trainee implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private City city;
    private transient int hashcode; //transient για να εξαιρεθει απο το Serializable

    public Trainee() {}

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }
    //Copy Constructor
    public Trainee(Trainee trainee) {
        this.name = trainee.name;
        this.city = trainee.city;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Trainee trainee = (Trainee) super.clone();
        City city = new City(this.getCity().getDescription());
        trainee.getCity();
        return trainee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return Objects.equals(getName(), trainee.getName()) &&
                Objects.equals(getCity(), trainee.getCity());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((name == null) ? 0 : city.hashCode());

        return result;

    }
}
