package com.example.demo.cursomc.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cursomc.domain.Cliente;
import com.example.demo.cursomc.domain.Endereco;
import com.example.demo.cursomc.repositories.EnderecoRepository;
import com.example.demo.cursomc.service.ClienteService;

@RestController
@RequestMapping(value="clientes")
public class ClienteResource {

	@Autowired
	private ClienteService service;
	
	@RequestMapping(value= "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> search (@PathVariable Integer id) {
		
		Cliente obj = service.find(id); 
		
		return ResponseEntity.ok().body(obj);
		
	}
}
