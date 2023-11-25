package com.raz.products.controller;

import com.raz.products.dto.ProductDto;
import com.raz.products.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductsService productsService;

    @PostMapping("/add")
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto productDto){
        return new ResponseEntity<>(productsService.addProduct(productDto),HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<ProductDto>> all(){
        return new ResponseEntity<>(productsService.allProducts(), HttpStatus.ACCEPTED);
    }
}
