package com.adbrains.miniprojectsb.controller;

import com.adbrains.miniprojectsb.model.Product;
import com.adbrains.miniprojectsb.response.ResponseHandler;
import com.adbrains.miniprojectsb.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Object> getProduct(@PathVariable("productId") Long productId){
        return ResponseHandler.responseBuilder
                ("Requested product details found successfully",
                        HttpStatus.OK, productService.getProduct(productId));
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
