package org.example.Shop;

public class ShopService {

    public static void run() {
        Shop shop = new Shop();
        Product product1 = new Product("Radio", 16F);
        CartItem cartItem = new CartItem(product1, 2);
        Cart cart = new Cart();
        cart.addNewItem(cartItem);
        shop.addProduct(product1);
        System.out.println(shop);
    }
}
