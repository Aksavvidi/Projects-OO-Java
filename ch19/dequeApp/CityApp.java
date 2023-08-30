package gr.aueb.cf.ch19.dequeApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CityApp {

    public static void main(String[] args) {
        //Populate
        List<String> cities = new ArrayList<>(List.of("Athens", "London", "Paris"));

        //Traverse list
        for (int i = 0; i< cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }

        for (String city: cities) {
            System.out.println(city);
        }

        cities.forEach(System.out::println);

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String s = it.next();
//            System.out.println(s);
            if (s.equals("Paris")) it.remove();
//            if (s.equals("Paris")) cities.remove();
        }

        cities.removeIf(s -> s.equals("London"));

        cities.forEach(System.out::println);
    }
}
