package com.esisba.tp1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private Sexe sexe;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "client")
    private Collection<Account> accounts;
}
