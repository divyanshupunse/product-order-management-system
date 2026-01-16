package com.divyanshu.product_order_management_system.controller;

import com.divyanshu.product_order_management_system.model.Product;
import com.divyanshu.product_order_management_system.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAllProducts(){
        return service.getAllProduct();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @PostMapping
    public String addProduct(@RequestBody Product p){
        service.addProduct(p);
        return "Product Added successfully";
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable int id ,@RequestBody Product p){
        p.setId(id);
        service.updateProduct(p);
        return "Product Update successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id){
        service.deleteProductById(id);
        return "Product deleted successfully";
    }


}
