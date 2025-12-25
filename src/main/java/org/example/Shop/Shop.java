package org.example.Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shop {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product findProductByName(String name) {
        for (Product p : products) {
            if (name.equals(p.getName())) {
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return Objects.equals(products, shop.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Shop{");
        for (Product p : products) {
            result.append(p);
        }
        return result.append('}').toString();
    }
}
