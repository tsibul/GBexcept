package org.paf.shop;

import java.util.List;

public class ProductBasket implements Basket{
    private String product;
    private int quantity;

    public ProductBasket(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }


    @Override
    public void addProduct(String product, int quantity) {

    }

    @Override
    public void removeProduct(String product) {

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

    }

    @Override
    public void clear() {

    }

    @Override
    public List<String> getProducts() {
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }
}
