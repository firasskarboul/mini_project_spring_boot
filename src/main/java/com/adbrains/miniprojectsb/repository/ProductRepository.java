package com.adbrains.miniprojectsb.repository;

import com.adbrains.miniprojectsb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
