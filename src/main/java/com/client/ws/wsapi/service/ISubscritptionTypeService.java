package com.client.ws.wsapi.service;

import com.client.ws.wsapi.model.SubscriptionType;

import java.util.List;

public interface ISubscritptionTypeService {

    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);
    SubscriptionType create(SubscriptionType subscriptionType);
    SubscriptionType update(Long id, SubscriptionType subscriptionType);

    void delete(Long id);


}
