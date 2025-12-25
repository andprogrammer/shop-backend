package org.example.Shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CartItemTest {

    private CartItem cartItem;

    @BeforeEach
    void setUp() {
        Product product = new Product("Lego", 32L);
        cartItem = new CartItem(product, 2);
    }

    @Test
    void shouldReturnProduct() {
        Product product = cartItem.getProduct();

        assertEquals("Lego", product.getName());
        assertEquals(32L, product.getPrice());
    }

    @Test
    void shouldReturnAmount() {
        assertEquals(2, cartItem.getAmount());
    }

    @Test
    void shouldReturnTotalPrice() {
        assertEquals(64L, cartItem.getTotalPrice());
    }

    @Test
    void shouldIncreaseAmount() {
        cartItem.increaseAmount(8);

        assertEquals(10, cartItem.getAmount());
    }
}
