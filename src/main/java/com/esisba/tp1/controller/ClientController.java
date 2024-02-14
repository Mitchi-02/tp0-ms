package com.esisba.tp1.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esisba.tp1.entities.Client;
import com.esisba.tp1.repository.ClientRepository;

@RestController 
@RequestMapping("/client-api")
public class ClientController {

    @Autowired
	private ClientRepository clientRepository;

    @GetMapping("/all")
    public Collection<Client> index() {
        return clientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Client show(@PathVariable("id") Long id) {
        return clientRepository.findById(id).get();
    }

    @PostMapping("/create")
    public Client store(@RequestBody Client client) {
        return clientRepository.save(client);
    }
}
