package com.esisba.tp1;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.esisba.tp1.entities.Account;
import com.esisba.tp1.entities.Client;
import com.esisba.tp1.entities.Sexe;
import com.esisba.tp1.repository.AccountRepository;
import com.esisba.tp1.repository.ClientRepository;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner{

	@Autowired
	ClientRepository clientRepository;

	@Autowired
	AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(Tp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");

		Client client1 = new Client(null, "ilyas", "i.benhammadi@esi-sba.dz", Sexe.Homme, null);
		Client client2 = new Client(null, "hakim", "h.allam@esi-sba.dz", Sexe.Homme,null);
		Client client3 = new Client(null, "nasro", "n.fliti@esi-sba.dz", Sexe.Homme,null);

		clientRepository.save(client1);
		clientRepository.save(client2);
		clientRepository.save(client3);

		Client c2 = clientRepository.findById(2L).get();

		Account acc = new Account(null, "login", "password", new Date(), c2);
		accountRepository.save(acc);

		String c1 = clientRepository.findNameById(2L);
		System.out.println(c1);
	}

}
