package com.raz.products.service;

import com.raz.products.dto.ProductDto;

import java.util.List;

public interface ProductsService {
    public ProductDto addProduct(ProductDto productDto);
    public List<ProductDto> allProducts();
}
