package Esercizio1;

import java.util.List;
import java.util.stream.Collectors;

public class Books {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1L, "Libro Java", "Books", 120.0),
                new Product(2L, "Mouse", "Electronics", 50.0),
                new Product(3L, "Romanzo", "Books", 80.0));

        List<Product> expansiveBooks = products.stream()
                .filter(p -> p.getCategory().equals("Books"))
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());

        expansiveBooks.forEach(p -> System.out.println(p.getName() + " - " + p.getPrice()));


    }
}
