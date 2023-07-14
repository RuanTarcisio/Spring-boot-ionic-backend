package com.example.demo.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.cursomc.domain.Categoria;

import com.example.demo.cursomc.domain.Cidade;
import com.example.demo.cursomc.domain.Cliente;
import com.example.demo.cursomc.domain.Endereco;
import com.example.demo.cursomc.domain.Estado;
import com.example.demo.cursomc.domain.Produto;
import com.example.demo.cursomc.domain.enums.TipoCliente;
import com.example.demo.cursomc.repositories.CategoriaRepository;
import com.example.demo.cursomc.repositories.CidadeRepository;
import com.example.demo.cursomc.repositories.ClienteRepository;
import com.example.demo.cursomc.repositories.EnderecoRepository;
import com.example.demo.cursomc.repositories.EstadoRepository;
import com.example.demo.cursomc.domain.Produto;
import com.example.demo.cursomc.repositories.CategoriaRepository;
import com.example.demo.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class Cursomc0Application implements CommandLineRunner{
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cursomc0Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		Estado est1 = new Estado(null, "Bahia");
		Estado est2 = new Estado(null, "Fortaleza");
		
		Cidade cid1 = new Cidade(null, "Salvador", est1);
		Cidade cid2 = new Cidade(null, "Recife", est2);
		Cidade cid3 = new Cidade(null, "Feira de Santana", est1);
		
		est1.getCidades().addAll(Arrays.asList(cid1, cid3));
		est2.getCidades().addAll(Arrays.asList(cid2));
		
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "Maria@gmail.com", "35121821281", TipoCliente.PESSOA_FISICA);
		cli1.getTelefones().addAll(Arrays.asList("7723231345", "7745434356"));

		Endereco end1 = new Endereco(null, "Rua Flores", "300", "Apto 203", "Jardim", "38220384", cli1, cid1);
		Endereco end2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro","38777012",cli1, cid2);
		
		cli1.getEnderecos().addAll(Arrays.asList(end1, end2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(end1,end2));
	}

}
