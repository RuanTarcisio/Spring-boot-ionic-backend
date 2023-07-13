package com.example.demo.cursomc.service;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
<<<<<<< HEAD

=======
>>>>>>> e523a24efbbd2d6b5cec58f8555437405425e53c
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

		
=======
>>>>>>> e523a24efbbd2d6b5cec58f8555437405425e53c
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.example.demo.cursomc.service.exception.ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
<<<<<<< HEAD
}

=======
}
>>>>>>> e523a24efbbd2d6b5cec58f8555437405425e53c
