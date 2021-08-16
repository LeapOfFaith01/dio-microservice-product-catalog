package com.challenges.productcatalog.controller;

import com.challenges.productcatalog.model.Product;
import com.challenges.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping
    Iterable<Product> get(){
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Product> get(@PathVariable String id){
        return productRepository.findById(id);
    }
    @PutMapping
    Product put(@RequestBody Product product){return productRepository.save(product);}
}
