package com.adbrains.miniprojectsb.service.impl;

import com.adbrains.miniprojectsb.model.Product;
import com.adbrains.miniprojectsb.repository.ProductRepository;
import com.adbrains.miniprojectsb.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long productId) {
        return productRepository.findById(productId).get();
    }

    @Override
    public String createProduct(Product product) {
        productRepository.save(product);
        return "Success: Product added to database.";
    }

    @Override
    public String updateProduct(Product product) {
        productRepository.save(product);
        return "Success: Product updated in database.";
    }

    @Override
    public String deleteProduct(Long productId) {
        productRepository.deleteById(productId);
        return "Success: Product deleted from database.";
    }
}
