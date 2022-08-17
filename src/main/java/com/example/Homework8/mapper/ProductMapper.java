package com.example.Homework8.mapper;

import com.example.Homework8.dto.ProductDTO;
import com.example.Homework8.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toProductDTO(Product product);

}