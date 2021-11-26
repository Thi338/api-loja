package com.api.api_loja.controllers;

import com.api.api_loja.entities.Service;
import com.api.api_loja.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ServiceController {

    @Autowired
    private ServiceRepository repository;

    @GetMapping
    public ResponseEntity<List<Service>> findAll() {
        List<Service> result = repository.findAll();
        return ResponseEntity.ok(result);
    }

}
