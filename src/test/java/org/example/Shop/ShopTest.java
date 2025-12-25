package org.example.Shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ShopTest {

    @Test
    void addProduct_addsProductToShop() {
        // Given
        Shop shop = new Shop();
        Product car = new Product("Car", 9999L);

        // When
        shop.addProduct(car);

        // Then
        Assertions.assertEquals(1, shop.getProducts().size());
        Assertions.assertEquals(car, shop.getProducts().get(0));
    }

    @Test
    void addProduct_nullProduct_doesNothing() {
        // Given
        Shop shop = new Shop();

        // When
        shop.addProduct(null);

        // Then
        Assertions.assertTrue(shop.getProducts().isEmpty());
    }

    @Test
    void getProducts_initiallyEmpty() {
        // Given
        Shop shop = new Shop();

        // When
        var products = shop.getProducts();

        // Then
        Assertions.assertNotNull(products);
        Assertions.assertTrue(products.isEmpty());
    }

    @Test
    void findProductByName_existingProduct_returnsProduct() {
        // Given
        Shop shop = new Shop();
        Product car = new Product("Car", 9999L);
        shop.addProduct(car);

        // When
        Product result = shop.findProductByName("Car");

        // Then
        Assertions.assertEquals(car, result);
    }

    @Test
    void findProductByName_nonExistingProduct_returnsNull() {
        // Given
        Shop shop = new Shop();

        // When
        Product result = shop.findProductByName("Car");

        // Then
        Assertions.assertNull(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"car", "CAR", " cAr "})
    void findProductByName_wrongCaseOrSpaces_returnsNull(String name) {
        // Given
        Shop shop = new Shop();
        shop.addProduct(new Product("Car", 9999L));

        // When
        Product result = shop.findProductByName(name);

        // Then
        Assertions.assertNull(result);
    }
}
