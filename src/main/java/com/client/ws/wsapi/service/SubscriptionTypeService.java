package com.client.ws.wsapi.service;

import com.client.ws.wsapi.dto.SubscriptionTypeDto;
import com.client.ws.wsapi.model.SubscriptionType;

import java.util.List;

public interface SubscriptionTypeService {

    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);
    SubscriptionType create(SubscriptionTypeDto subscriptionTypeDto);
    SubscriptionType update(Long id, SubscriptionTypeDto subscriptionTypeDto);

    void delete(Long id);


    SubscriptionType updateField(Long id, SubscriptionTypeDto subscriptionTypeDto);
}
