package org.example.Shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartTest {

    private Cart cart;

    @BeforeEach
    void setUp() {
        cart = new Cart();
    }

    @Test
    void addNewItem() {
        Assertions.assertEquals(0, cart.getItems().size());

        CartItem cartItem = createSampleItem();
        cart.addNewItem(cartItem);
        Assertions.assertEquals(1, cart.getItems().size());
    }

    @Test
    void getTotalPrice() {
        Assertions.assertEquals(0, cart.getTotalPrice());

        CartItem cartItem = createSampleItem();
        cart.addNewItem(cartItem);
        Assertions.assertEquals(198, cart.getTotalPrice());
    }

    @Test
    void getItems() {
        Assertions.assertEquals(0, cart.getItems().size());

        CartItem cartItem = createSampleItem();
        cart.addNewItem(cartItem);
        Assertions.assertEquals(cartItem, cart.getItems().get(0));
    }

    private CartItem createSampleItem() {
        Product product = new Product("Desc", 99L);
        return new CartItem(product, 2);
    }
}