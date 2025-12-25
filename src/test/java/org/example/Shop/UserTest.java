package org.example.Shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void getIdTest() {
        User user = new User(32F);
        Assertions.assertEquals(user.getId(), 32F);
    }

    @Test
    void getCartTest() {
        User user = new User(32F);
        Cart cart = new Cart();

        Product product = new Product("Lego", 32L);
        CartItem cartItem = new CartItem(product, 2);
        cart.addNewItem(cartItem);

        user.getCart().addNewItem(cartItem);

        Assertions.assertEquals(1, user.getCart().getItems().size());
        Assertions.assertEquals(cart, user.getCart());
    }
}