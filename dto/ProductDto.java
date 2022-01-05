package com.task.shopCart.dto;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class ProductDto {

    private Integer productId;

    private String name;

    private double price;

    private String description;


    private Integer qty;

    private String added_on;


}
