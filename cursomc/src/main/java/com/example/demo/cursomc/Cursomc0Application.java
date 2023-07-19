package com.example.demo.cursomc;

import java.text.SimpleDateFormat;
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
import com.example.demo.cursomc.domain.ItemPedido;
import com.example.demo.cursomc.domain.Pagamento;
import com.example.demo.cursomc.domain.PagamentoComBoleto;
import com.example.demo.cursomc.domain.PagamentoComCartao;
import com.example.demo.cursomc.domain.Pedido;
import com.example.demo.cursomc.domain.Produto;
import com.example.demo.cursomc.domain.enums.EstadoPagamento;
import com.example.demo.cursomc.domain.enums.TipoCliente;
import com.example.demo.cursomc.repositories.CategoriaRepository;
import com.example.demo.cursomc.repositories.CidadeRepository;
import com.example.demo.cursomc.repositories.ClienteRepository;
import com.example.demo.cursomc.repositories.EnderecoRepository;
import com.example.demo.cursomc.repositories.EstadoRepository;
import com.example.demo.cursomc.repositories.ItemPedidoRepository;
import com.example.demo.cursomc.repositories.PagamentoRepository;
import com.example.demo.cursomc.repositories.PedidoRepository;
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
	@Autowired
	private PagamentoRepository pagamentoRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cursomc0Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		Categoria cat3 = new Categoria(null, "Cama, mesa e banha");
		Categoria cat4 = new Categoria(null, "Eletrônicos");
		Categoria cat5 = new Categoria(null, "Jardinagem");
		Categoria cat6 = new Categoria(null, "Decoração");
		Categoria cat7 = new Categoria(null, "Perfumaria");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
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
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
					
		Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"), end1, cli1);
		Pedido ped2 = new Pedido(null, sdf.parse("10/10/2017 19:35"), end2, cli1);
		
		Pagamento pag1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pag1);
		Pagamento pag2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, sdf.parse("20/10/2017 00:00"), null);
		ped2.setPagamento(pag2);
		
		cli1.getPedidos().addAll(Arrays.asList(ped1,ped2));
		
		pedidoRepository.saveAll(Arrays.asList(ped1,ped2));
		pagamentoRepository.saveAll(Arrays.asList(pag1,pag2)); 
		
		ItemPedido ip1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.00);
		ItemPedido ip2 = new ItemPedido(ped1, p3, 0.00, 2, 80.00);
		ItemPedido ip3 = new ItemPedido(ped2, p2, 100.00, 1, 800.00);
		
		ped1.getItens().addAll(Arrays.asList(ip1,ip2));
		ped2.getItens().addAll(Arrays.asList(ip3));
		
		p1.getItens().addAll(Arrays.asList(ip1));
		p2.getItens().addAll(Arrays.asList(ip3));
		p3.getItens().addAll(Arrays.asList(ip2));
		
		itemPedidoRepository.saveAll(Arrays.asList(ip1,ip2,ip3));
		
	}
}
