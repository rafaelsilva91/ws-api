package com.client.ws.wsapi.service.impl;

import com.client.ws.wsapi.exceptions.NotFoundExceptionHandler;
import com.client.ws.wsapi.model.SubscriptionType;
import com.client.ws.wsapi.repository.ISubscriptionTypRepository;
import com.client.ws.wsapi.service.ISubscritptionTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionTypeServiceImpl implements ISubscritptionTypeService {

    private ISubscriptionTypRepository subscriptionTypRepository;

    public SubscriptionTypeServiceImpl(ISubscriptionTypRepository subscriptionTypRepository) {
        this.subscriptionTypRepository = subscriptionTypRepository;
    }

    @Override
    public List<SubscriptionType> findAll() {
        return subscriptionTypRepository.findAll();
    }

    @Override
    public SubscriptionType findById(Long id) {
        Optional<SubscriptionType> optionalSubscriptionType = subscriptionTypRepository.findById(id);
        if (optionalSubscriptionType.isEmpty()){
            throw new NotFoundExceptionHandler("SubscriptionType não encontrado");
        }

        return optionalSubscriptionType.get();
    }

    @Override
    public SubscriptionType create(SubscriptionType subscriptionType) {
        return null;
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionType subscriptionType) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
