package com.adbrains.miniprojectsb.controller;

import com.adbrains.miniprojectsb.model.Product;
import com.adbrains.miniprojectsb.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("{productId}")
    public Product getProduct(@PathVariable("productId") Long productId){
        return productService.getProduct(productId);
    }

    @PostMapping
    public String createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @PutMapping
    public String updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId){
        return productService.deleteProduct(productId);
    }
}
