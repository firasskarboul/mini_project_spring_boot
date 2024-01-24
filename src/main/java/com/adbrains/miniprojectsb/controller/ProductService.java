package com.adbrains.miniprojectsb.controller;

import com.adbrains.miniprojectsb.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductService {

    Product product;

    @GetMapping("{productId}")
    public Product getProduct(Long productId){
        return product;
        // new Product(1L, "iPhone 15 Pro Max", 1200, 5);
    }

    @PostMapping
    public String createProduct(@RequestBody Product product){
        this.product = product;
        return "Success: Product created.";
    }

    @PutMapping
    public String updateProduct(@RequestBody Product product){
        this.product = product;
        return "Success: Product updated.";
    }

    @DeleteMapping("{productId}")
    public String deleteProduct(Long productId){
        this.product = null;
        return "Success: Product deleted.";
    }
}
