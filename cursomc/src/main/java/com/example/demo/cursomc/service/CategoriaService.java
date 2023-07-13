package com.example.demo.cursomc.service;

import java.util.Optional;

<<<<<<< HEAD
=======
import org.hibernate.ObjectNotFoundException;
>>>>>>> e523a24 (Ajustes no endPoint /Categorias/{id})
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cursomc.domain.Categoria;
import com.example.demo.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
<<<<<<< HEAD
		
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
=======
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.example.demo.cursomc.service.exception.ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
>>>>>>> e523a24 (Ajustes no endPoint /Categorias/{id})
