package com.ecommerce.project.service;

import com.ecommerce.project.model.Product;
import com.ecommerce.project.payload.ProductDTO;
import org.springframework.stereotype.Service;

public interface ProductService {
    ProductDTO add(Long categoryId, Product product);
}
