package com.client.ws.wsapi.controller;

import com.client.ws.wsapi.exceptions.NotFoundExceptionHandler;
import com.client.ws.wsapi.model.SubscriptionType;
import com.client.ws.wsapi.service.ISubscritptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {

    @Autowired
    private ISubscritptionTypeService _service;

    @GetMapping()
    public ResponseEntity<List<SubscriptionType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(_service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionType> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(_service.findById(id));
    }




}
