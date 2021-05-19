package com.sw409.FairfieldUstore.dto;

import com.sw409.FairfieldUstore.models.Product;

public class OrderProductDto {
	// DTO used in conjunction with data access objects to retrieve data from a database
	
    private Product product;
    private Integer quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
