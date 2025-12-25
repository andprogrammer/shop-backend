package org.example.Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cart {

    private final List<CartItem> items = new ArrayList<>();

    public void addNewItem(CartItem item) {
        if (item == null) {
            return;
        }
        for (CartItem it : items) {
            if (it.equals(item)) {
                it.increaseAmount(item.getAmount());
                return;
            }
        }
        items.add(item);
    }

    public double getTotalPrice() {
        double result = 0L;
        for (CartItem it : items) {
            result += it.getTotalPrice();
        }
        return result;
    }

    public List<CartItem> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cart)) return false;
        Cart cart = (Cart) o;
        return Objects.equals(items, cart.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Cart{");
        for (CartItem it : items) {
            result.append(it);
        }
        return result.append('}').toString();
    }
}
