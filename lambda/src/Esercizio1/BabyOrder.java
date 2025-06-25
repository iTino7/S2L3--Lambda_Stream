package Esercizio1;

import java.util.List;
import java.util.stream.Collectors;

public class BabyOrder {
    public static void main(String[] args) {
        List<Product> prodotti1 = List.of(
                new Product(1L, "Pannolini", "Baby", 30.0),
                new Product(2L, "Biberon", "Baby", 20.0)
        );

        List<Product> prodotti2 = List.of(
                new Product(3L, "Mouse", "Electronics", 25.0),
                new Product(4L, "Libro", "Books", 80.0)
        );

        List<Product> prodotti3 = List.of(
                new Product(5L, "Tappeto gioco", "Baby", 55.0),
                new Product(6L, "Tastiera", "Electronics", 60.0)
        );

        Order ordine1 = new Order(1001, prodotti1);
        Order ordine2 = new Order(1002, prodotti2);
        Order ordine3 = new Order(1003, prodotti3);

        List<Order> orders = List.of(ordine1, ordine2, ordine3);

        List<Order> babyOrders = orders.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory().equalsIgnoreCase("baby")))
                .collect(Collectors.toList());

        System.out.println("Ordini con prodotti Baby:");
        babyOrders.forEach(order -> System.out.println("Oridne ID: " + order.getId()));

    }
}
