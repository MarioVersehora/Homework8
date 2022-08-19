package com.example.Homework8;

import com.example.Homework8.controller.ProductController;
import com.example.Homework8.model.Product;
import com.example.Homework8.model.ProductType;
import com.example.Homework8.service.ProductService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    @MockBean
    ProductService productService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void it_should_get_all_products() throws Exception {
        Product product = new Product(null, ProductType.ELB, "Aragaz", "F123", 50, false, 54);

        mockMvc.perform(get("/product"))
                .andExpect(status().isOk());
    }

    @Test
    public void it_should_save_product() throws Exception {
        String request = new String("{ \"type\" : \"ELB\", \"name\" : \"Aragaz\", \"identificationCode\" : \"F123\", \"stock\" : \"20\",\"price\" : \"55\"}");

        mockMvc.perform(post("/product")
                        .content(request)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}
