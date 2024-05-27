package com.client.ws.wsapi.service.impl;

import com.client.ws.wsapi.dto.SubscriptionTypeDto;
import com.client.ws.wsapi.exceptions.BadRequestException;
import com.client.ws.wsapi.exceptions.NotFoundException;
import com.client.ws.wsapi.mapper.SubscriptionTypeMapper;
import com.client.ws.wsapi.model.SubscriptionType;
import com.client.ws.wsapi.repository.ISubscriptionTypRepository;
import com.client.ws.wsapi.service.SubscriptionTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {

    private ISubscriptionTypRepository subscriptionTypeRepository;

    public SubscriptionTypeServiceImpl(ISubscriptionTypRepository subscriptionTypeRepository) {
        this.subscriptionTypeRepository = subscriptionTypeRepository;
    }

    @Override
    public List<SubscriptionType> findAll() {
        return subscriptionTypeRepository.findAll();
    }

    @Override
    public SubscriptionType findById(Long id) {
        return this.getSubscriptionType(id);
    }

    @Override
    public SubscriptionType create(SubscriptionTypeDto dto) {
        if(Objects.nonNull(dto.getId())){
            throw new BadRequestException("O campo ID deve ser nulo");
        }
        return subscriptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(dto));
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionTypeDto dto) {
        this.getSubscriptionType(id);
        dto.setId(id);
        return subscriptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(dto));
    }

    @Override
    public SubscriptionType updateField(Long id, SubscriptionTypeDto dto) {
        SubscriptionType object = this.getSubscriptionType(id);

        return subscriptionTypeRepository.save(SubscriptionType.builder()
                .id(id)
                .name(dto.getName() != null ? dto.getName() : object.getName())
                .accessMonths(dto.getAccessMonths() != null ? dto.getAccessMonths() : object.getAccessMonths())
                .price(dto.getPrice() != null ? dto.getPrice() : object.getPrice())
                .productKey(dto.getProductKey() != null ? dto.getProductKey() : object.getProductKey())
                .build());
    }

    @Override
    public void delete(Long id) {
        this.getSubscriptionType(id);
        this.subscriptionTypeRepository.deleteById(id);
    }

    private SubscriptionType getSubscriptionType(Long id) {
        Optional<SubscriptionType> optionalSubscriptionType = subscriptionTypeRepository.findById(id);

        if (optionalSubscriptionType.isEmpty()){
            throw new NotFoundException("SubscriptionType não encontrado");
        }

        return optionalSubscriptionType.get();
    }
}
