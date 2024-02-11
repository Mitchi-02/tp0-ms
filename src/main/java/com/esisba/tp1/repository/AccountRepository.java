package com.esisba.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.esisba.tp1.entities.Client;


@RepositoryRestController
public interface ClientRepository extends JpaRepository<Client, Long> {

}