package com.raz.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryDto {
    private Long inventoryProductId;
    private String inventoryProductName;
    private Integer inventoryProductQuantity;
    private String inventoryProductCategory;
}
