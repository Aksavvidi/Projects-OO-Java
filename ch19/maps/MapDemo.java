package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>(){
            //Populate 1st way
            {
                put("GR", "Greece");
                put("FR", "France");
            }
        };
        // >= JDK9 Populate 2nd way
        Map<String, String> countries2 = Map.of(
                "USA", "United State of America",
                "IT", "Italy"
        );
        //Populate 3rd way
        Map<String, String> countries3 = new HashMap<String, String>(
                Map.of(
                        "USA", "United State of America",
                        "IT", "Italy"
                )
        );

        //Populate 4th way
        countries.put("DE", "Germany");
        countries.put("FI", "Finland");

        //διασχιζω το Map με ενα Iterator
        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        //διασχιζω το Map με ενχανσ φορ
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
