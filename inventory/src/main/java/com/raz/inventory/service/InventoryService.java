package com.raz.inventory.service;

import com.raz.inventory.dto.InventoryDto;

import java.util.List;

public interface InventoryService {
    public InventoryDto addToInventory(InventoryDto inventoryDto);
    public List<InventoryDto> allInventoryList();
}