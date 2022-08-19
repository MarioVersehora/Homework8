package com.example.Homework8;

import com.example.Homework8.model.Product;
import com.example.Homework8.model.ProductType;
import com.example.Homework8.repository.ProductRepository;
import com.example.Homework8.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @Mock
    ProductRepository productRepository;

    @InjectMocks
    ProductService productService;


    @Test
    public void when_save_product_it_should_return_product() throws Exception {
        Product product = new Product(null, ProductType.ELB, "Aragaz", "F123", 50, false, 54);

        when(productRepository.save(any(Product.class))).thenReturn(new Product());
        Product created = productService.saveProduct(product);
        assertThat(created.getName()).isSameAs(product.getName());

    }
}
