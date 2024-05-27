package com.client.ws.wsapi.mapper;

import com.client.ws.wsapi.dto.SubscriptionTypeDto;
import com.client.ws.wsapi.model.SubscriptionType;

public class SubscriptionTypeMapper {

    public static SubscriptionType fromDtoToEntity(SubscriptionTypeDto dto){
        return SubscriptionType.builder()
                .id(dto.getId())
                .name(dto.getName())
                .accessMonth(dto.getAccessMonth())
                .price(dto.getPrice())
                .productKey(dto.getProductKey())
                .build();
    }

}
