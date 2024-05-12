package com.microservice.inventoryservice.mapper;

import com.microservice.inventoryservice.dto.IAppDto;
import com.microservice.inventoryservice.model.IAppEntity;

public interface IMapper<E extends IAppEntity, D extends IAppDto> {
    D toDto(E entity);
}
