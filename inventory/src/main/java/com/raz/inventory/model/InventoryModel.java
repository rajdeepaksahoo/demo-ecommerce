package com.raz.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "INVENTORY_TAB")
public class InventoryModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "INVENTORY_PRODUCT_ID")
    private Long inventoryProductId;
    @Column(name = "INVENTORY_PRODUCT_NAME")
    private String inventoryProductName;
    @Column(name = "INVENTORY_PRODUCT_QUANTITY")
    private Integer inventoryProductQuantity;
    @Column(name = "INVENTORY_PRODUCT_CATEGORY")
    private String inventoryProductCategory;
}
