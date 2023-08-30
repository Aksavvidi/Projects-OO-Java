package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static <list> void main(String[] args) {
        Map<String, Product> products = new HashMap<>() {
            //Populate
            {
                put("ORA", new Product("ORA", "Oranges", 10.5, 20));
                put("HON", new Product("HON", "Honey", 12.5, 10));
                put("MIL", new Product("MIL", "Milk", 1.2, 1));
                put("EGG", new Product("EGG", "Eggs", 8.2, 6));
            }
        };

        Map<String, Object> criteria = new HashMap<>() {{
            put("description", "Eggs");
            put("price", 7.5);
        }};
        String eggs = products.values().stream()
                .filter(pro -> pro.getDescription().equals(criteria.get("description"))
                        && (Double.compare(pro.getPrice(), (double) criteria.get("price")) > 0))
                .map(Product::toString)
                .collect(Collectors.joining());

        System.out.println(eggs);


       products.entrySet().forEach(System.out::println);
        products.forEach((k, v) -> System.out.println(k + " " + v ));

        String orangesStr = products.entrySet().stream()
                .filter(entry -> entry.getKey().equals("ORA") )
                .map(Objects::toString)
                .collect(Collectors.joining(", "));

        //System.out.println(orangesStr);

        String productByPrice = products.entrySet().stream()
                .filter(entry -> entry.getValue().getPrice() > 5.1 )
                .map(Objects::toString)
                .collect(Collectors.joining("\n"));

        //System.out.println(productByPrice);

        List<Product> pros = products.values().stream()
                .filter(product -> product.getPrice() > 10.2)
                .collect(Collectors.toList());

        pros.forEach(System.out::println);

        int total = products.values().stream()
                .filter(product -> product.getPrice() > 5)
                .mapToInt(Product::getQuantity)
                .sum();

        System.out.println("Total quantity of products with price > 5: " + total);

        int total2 = products.values().stream()
                .filter(product -> product.getPrice() > 10.2)
                .mapToInt(Product::getQuantity)
                .reduce(0, Integer::sum);

    }
}
