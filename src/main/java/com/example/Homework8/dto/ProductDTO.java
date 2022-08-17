package com.example.Homework8.dto;

import com.example.Homework8.model.ProductType;
import lombok.Data;

@Data
public class ProductDTO {

    ProductType type;
    String name;
    String identificationCode;
    Integer stock;
    Boolean deleted;

}