package com.ensat.services;

import com.ensat.entities.Product;

public interface ProductService {

    Iterable<Product> listAllProducts();

    Product getProductById(Integer id) throws Exception;

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

}
