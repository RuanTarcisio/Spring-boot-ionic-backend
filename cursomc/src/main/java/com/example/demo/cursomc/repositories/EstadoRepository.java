package com.example.demo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.cursomc.domain.Estado;
import com.example.demo.cursomc.domain.Produto;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{


}
