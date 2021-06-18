package com.Alex_Kuzmin.springboot.services;

import com.Alex_Kuzmin.springboot.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
