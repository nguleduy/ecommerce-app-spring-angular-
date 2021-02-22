package com.ecommerce.backend.controller;

import com.ecommerce.backend.model.Product;
import com.ecommerce.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin("http://localhost:4200")
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping("products")
  public List<Product> getProducts() {
    return productService.getProducts();
  }

  @GetMapping("products/by-category")
  public List<Product> getProductsByCategoryId(@RequestParam Long id) {
    return productService.getProductsByCategoryId(id);
  }

  @GetMapping("products/by-keyword")
  public List<Product> getProductsByKeyword(@RequestParam String keyword) {
    return productService.getProductsByKeyword(keyword);
  }
}
