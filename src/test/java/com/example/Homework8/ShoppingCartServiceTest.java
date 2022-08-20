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

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class ShoppingCartServiceTest {

    @Mock
    ShoppingCartRepository shoppingCartRepository;

    @InjectMocks
    ShoppingCartService shoppingCartService;

    @Test
    public void it_should_get_totalPrice() {
        Product product = new Product(null, ProductType.ELB, "Aragaz", "F123", 50, false, 54);
        List<Product> listOfProducts = new ArrayList<>();
        ShoppingCart shoppingCart = new ShoppingCart(null, listOfProducts);
        shoppingCart.addProduct(product);

        assertThat(shoppingCartService.totalPrice(1)).isEqualTo(product);
    }
}
