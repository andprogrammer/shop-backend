package org.example.Shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {
    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product("PC", 1024F);
    }

    @Test
    void getNameTest() {
        assertEquals(product.getName(), "PC");
    }

    @Test
    void getPriceTest() {
        assertEquals(product.getPrice(), 1024F);
    }
}