package com.productManagement.ProductManagement.ProductController;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.productManagement.ProductManagement.ProductService.ProductService;
import com.productManagement.ProductManagement.model.Product;
 
@RestController
public class ProductController {
 
    @Autowired
    private ProductService service;
 // RESTful API methods for Retrieval operations
    @GetMapping("/products")
public List<Product> list() {
    return service.listAll();
}
    //RESTful API method for creating operations
    @PostMapping("/products")
    public void add(@RequestBody Product product) {
        service.save(product);
    }
    //RESTful API method for product id Retrieval
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> get(@PathVariable Integer id) {
        try {
            Product product = service.get(id);
            return new ResponseEntity<Product>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }      
    }
    //RESTful API method for update operations
    @PutMapping("/products/{id}")
    public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id) {
        try {
            Product existProduct = service.get(id);
            service.save(product);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
    //RESTful API method For Delete operations
    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}

