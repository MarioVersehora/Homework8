package com.example.Homework8;

import com.example.Homework8.model.Product;
import com.example.Homework8.model.ProductType;
import com.example.Homework8.model.ShoppingCart;
import com.example.Homework8.repository.ShoppingCartRepository;
import com.example.Homework8.service.ShoppingCartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ShoppingCartServiceTest {

    @Mock
    ShoppingCartRepository shoppingCartRepository;

    @InjectMocks
    ShoppingCartService shoppingCartService;

    @Test
    public void it_should_get_totalPrice() {
        Product product = new Product(null, ProductType.ELB, "Aragaz", "F123", 50, false, 54);

        assertThat(shoppingCartService.totalPrice(1)).isEqualTo(product);
    }
}
