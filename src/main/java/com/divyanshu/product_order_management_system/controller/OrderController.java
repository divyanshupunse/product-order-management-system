package com.divyanshu.product_order_management_system.controller;

import com.divyanshu.product_order_management_system.model.Orders;
import com.divyanshu.product_order_management_system.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping
    public List<Orders> getOrders(){
        return service.getAllOrder();
    }
    @GetMapping("/{orderId}")
    public Optional<Orders> getOrderById(@PathVariable int orderId){
        return service.getOrderById(orderId);
    }
    @PostMapping()
    public String addOrder(@RequestBody Orders order){
        service.addOrder(order);
        return "Order added successfully";
    }
    @PutMapping("/{orderId}")
    public String updateOrder(@PathVariable int orderId,@RequestBody Orders order){
        order.setOrderId(orderId);
        service.updateOrder(order);
        return "Order updated successfully";
    }
    @DeleteMapping("/{orderId}")
    public String deleteOrder(@PathVariable int orderId){
        service.deleteOrderByOrderId(orderId);
        return "order delete successfully";
    }

}
