package com.sw409.FairfieldUstore.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sw409.FairfieldUstore.exceptions.ResourceNotFoundException;
import com.sw409.FairfieldUstore.models.Product;
import com.sw409.FairfieldUstore.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImp implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return productRepository
          .findById(id)
          .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
