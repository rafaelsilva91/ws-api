package com.client.ws.wsapi.controller;

import com.client.ws.wsapi.dto.SubscriptionTypeDto;
import com.client.ws.wsapi.model.SubscriptionType;
import com.client.ws.wsapi.service.SubscritptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {

    @Autowired
    private SubscritptionTypeService _service;

    @GetMapping
    public ResponseEntity<List<SubscriptionType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(_service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionType> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(_service.findById(id));
    }

    @PostMapping
    public ResponseEntity<SubscriptionType> create(@RequestBody SubscriptionTypeDto subscriptionTypeDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(_service.create(subscriptionTypeDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SubscriptionType> update(@PathVariable("id") Long id, @RequestBody SubscriptionTypeDto subscriptionTypeDto){
        return ResponseEntity.status(HttpStatus.OK).body(_service.update(id, subscriptionTypeDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<SubscriptionType> updateField(@PathVariable("id") Long id, @RequestBody SubscriptionTypeDto subscriptionTypeDto){
        return ResponseEntity.status(HttpStatus.OK).body(_service.updateField(id, subscriptionTypeDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this._service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
