package Esercizio1;

import java.util.List;

public class Order {
    private int id;
    private List<Product> products;

    public Order(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }
}
