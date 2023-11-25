package com.raz.products.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.raz.products.dto.ProductDto;
import com.raz.products.model.ProductsModel;
import com.raz.products.repository.ProductsRepository;
import com.raz.products.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductsService {

    private final ProductsRepository repository;
    @Override
    public ProductDto addProduct(ProductDto productDto) {

        return modelToDto(repository.save(dtoToModel(productDto)));
    }

    @Override
    public List<ProductDto> allProducts() {
        return modelsListToDto(repository.findAll());
    }

    private ProductsModel dtoToModel(ProductDto productDto){
        return ProductsModel.builder()
                .productId(productDto.getProductId())
                .productCategory(productDto.getProductCategory())
                .productName(productDto.getProductName())
                .productBrand(productDto.getProductBrand())
                .build();
    }

    private ProductDto modelToDto(ProductsModel model){
        return ProductDto.builder()
                .productId(model.getProductId())
                .productCategory(model.getProductCategory())
                .productName(model.getProductName())
                .productBrand(model.getProductBrand())
                .build();
    }

    private List<ProductDto> modelsListToDto(List<ProductsModel> models){
        return models.stream().map(this::modelToDto).toList();
    }
}
