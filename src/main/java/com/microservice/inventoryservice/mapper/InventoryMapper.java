package com.microservice.inventoryservice.mapper;

import com.microservice.inventoryservice.dto.InventoryResponse;
import com.microservice.inventoryservice.model.Inventory;

public class InventoryMapper implements IMapper<Inventory, InventoryResponse> {
    @Override
    public InventoryResponse toDto(Inventory entity) {
        return InventoryResponse.builder()
                .skuCode(entity.getSkuCode())
                .isInStock(entity.getQuantity() > 0)
                .build();
    }
}
