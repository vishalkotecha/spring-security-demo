package com.vishalkotecha.ssdemo.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.vishalkotecha.ssdemo.dao.ProductDao;
import com.vishalkotecha.ssdemo.model.Products;

/**
 * @author Vishal Kotecha
 */
@Service
public class ProductService {

  private final ProductDao productRepository;

  public ProductService(ProductDao productRepository) {
    this.productRepository = productRepository;
  }

  public List<Products> getAll() {
    return productRepository.findAll();
  }
}
