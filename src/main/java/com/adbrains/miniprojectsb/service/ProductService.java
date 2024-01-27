package com.adbrains.miniprojectsb.service;

import com.adbrains.miniprojectsb.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();
    public Product getProduct(Long productId);
    public String createProduct(Product product);
    public String updateProduct(Product product);
    public String deleteProduct(Long productId);
}
