package com.abw12.springbootawscicd;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {

    public List<OrderEntity> orderList(){
        return Stream.of(
                new OrderEntity(1,"laptop","Delivered",50000),
                new OrderEntity(2,"Mobile","Delivered",66000),
                new OrderEntity(3,"Tablet","Out for Delivery",25500),
                new OrderEntity(4,"SmartWatch","Shipped",33000)
        ).collect(Collectors.toList());
    }

}
