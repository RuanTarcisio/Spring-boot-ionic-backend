package com.example.demo.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cursomc.domain.Categoria;
import com.example.demo.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.example.demo.cursomc.service.exception.ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
}