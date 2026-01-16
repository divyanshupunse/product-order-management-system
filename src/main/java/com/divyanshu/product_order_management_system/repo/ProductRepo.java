package com.divyanshu.product_order_management_system.repo;

import com.divyanshu.product_order_management_system.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
