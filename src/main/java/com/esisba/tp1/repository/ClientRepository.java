package com.esisba.tp1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.esisba.tp1.entities.Client;


@RepositoryRestController
public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findClientsByName(String name);

    @Query("select c.name from Client c where c.id = :x")
    String findNameById(@Param("x") Long id);
}