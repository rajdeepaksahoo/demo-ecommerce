package com.raz.inventory.service.impl;

import com.raz.inventory.dto.InventoryDto;
import com.raz.inventory.model.InventoryModel;
import com.raz.inventory.repository.InventoryRepository;
import com.raz.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepository repository;
    @Override
    public InventoryDto addToInventory(InventoryDto inventoryDto) {
        return null;
    }

    @Override
    public List<InventoryDto> allInventoryList() {
        return null;
    }

    private InventoryModel dtoToModel(InventoryDto dto){
        return InventoryModel.builder()
                .inventoryProductQuantity(dto.getInventoryProductQuantity())
                .inventoryProductCategory(dto.getInventoryProductCategory())
                .inventoryProductName(dto.getInventoryProductName())
                .build();
    }
    private InventoryDto modelToDto(InventoryModel model){
        return InventoryDto.builder()
                .inventoryProductId(model.getInventoryProductId())
                .inventoryProductQuantity(model.getInventoryProductQuantity())
                .inventoryProductCategory(model.getInventoryProductCategory())
                .inventoryProductName(model.getInventoryProductName())
                .build();
    }

}
