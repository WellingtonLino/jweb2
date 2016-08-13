package com.example.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.examplemodel.Cliente;
import com.examplemodel.repository.ClienteRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TesteClienteRepository {
	
	@Autowired
	ClienteRepository repository;
	
	@Test
	public void testeSalvar() {
		Cliente cliente = new Cliente();
		cliente.setNome("Jão");
		cliente.setEmail("jao@gmail.com");
		cliente.setCpf("999999");
		repository.save(cliente);
		
	}
}
