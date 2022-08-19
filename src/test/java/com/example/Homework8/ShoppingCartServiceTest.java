package com.example.Homework8;

import com.example.Homework8.model.ShoppingCart;
import com.example.Homework8.repository.ShoppingCartRepository;
import com.example.Homework8.service.ShoppingCartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ShoppingCartServiceTest {

    @Mock
    ShoppingCartRepository shoppingCartRepository;

    @InjectMocks
    ShoppingCartService shoppingCartService;

    @Test
    public void when_create_shoppingCart_it_should_return_shoppingCart() {
        when(shoppingCartRepository.save(any(ShoppingCart.class))).thenReturn(new ShoppingCart());

    }
}
