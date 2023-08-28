package gr.aueb.cf.ch17.clona;

import java.io.Serializable;
import java.util.Objects;

public class City implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String description;

    public City() {}

    public City(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "City{" +
                "description='" + description + '\'' +
                '}';
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        return getDescription() != null ? getDescription().equals(city.getDescription()) : city.getDescription() == null;
    }

    @Override
    public int hashCode() {
        return getDescription() != null ? getDescription().hashCode() : 0;
    }
}
