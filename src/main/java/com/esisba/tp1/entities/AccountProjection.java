package com.esisba.tp1.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="pr", types=Account.class)
public interface AccountProjection {

    public Long getId(); 

    public String getLogin();

    @Value("#{target.client.email}")
    public String getEmail(); 
}

