package com.sw409.FairfieldUstore.controllers;

import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.FairfieldUstore.models.Product;
import com.sw409.FairfieldUstore.services.ProductService;
@RestController
@RequestMapping("api/v1/getAllProducts")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "","/" })
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
}