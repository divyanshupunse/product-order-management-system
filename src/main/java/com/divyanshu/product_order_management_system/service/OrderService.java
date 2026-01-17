package com.divyanshu.product_order_management_system.service;

import com.divyanshu.product_order_management_system.model.Orders;
import com.divyanshu.product_order_management_system.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepo repo;

    public List<Orders> getAllOrder(){
        return repo.findAll();
    }

    public Optional<Orders> getOrderById(int orderId){
        return repo.findById(orderId);
    }

    public Orders addOrder(Orders order){
       return repo.save(order);
    }

    public Orders updateOrder(Orders order){
        return repo.save(order);
    }
    public void deleteOrderByOrderId(int orderId){
         repo.deleteById(orderId);

    }


}
