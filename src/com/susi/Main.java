package com.susi;

import com.susi.model.Product;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Product product = new Product ("Keyboard");

        System.out.println(product.getName());
    }

}
