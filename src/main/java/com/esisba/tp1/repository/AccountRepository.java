package com.esisba.tp1.repository;

import com.esisba.tp1.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;


@RepositoryRestController
public interface AccountRepository extends JpaRepository<Account, Long> {

}