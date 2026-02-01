package com.food.order.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private UUID orderId;
    private String userName;
    private String dishName;
    private String dishCategory;
    private int quantity;
    private String customize;
}