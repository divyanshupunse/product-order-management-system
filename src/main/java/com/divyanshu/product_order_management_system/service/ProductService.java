package com.divyanshu.product_order_management_system.service;

import com.divyanshu.product_order_management_system.model.Product;
import com.divyanshu.product_order_management_system.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public Product addProduct(Product p){
        return repo.save(p);
    }

    public List<Product> getAllProduct(){
        return repo.findAll();
    }

    public Optional<Product> getProductById(int id){
        return repo.findById(id);
    }

    public Product updateProduct(Product p){
        return repo.save(p);
    }

    public void deleteProductById(int id){
        repo.deleteById(id);
    }



}
