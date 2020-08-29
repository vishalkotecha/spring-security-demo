package com.vishalkotecha.ssdemo.controller;

import com.vishalkotecha.ssdemo.model.Products;
import com.vishalkotecha.ssdemo.service.ProductService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vishal Kotecha
 */
@RestController
@RequestMapping("/products")
public class ProductsController {

  private final ProductService productService;

  public ProductsController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping
  public List<Products> getAll() {
    return productService.getAll();
  }
}
