package com.abw12.springbootawscicd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

    private long orderId;
    private String productName;
    private String orderStatus;
    private long price;
}
