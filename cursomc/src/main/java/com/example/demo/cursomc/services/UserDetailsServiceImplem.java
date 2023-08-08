package com.example.demo.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo.cursomc.domain.Cliente;
import com.example.demo.cursomc.repositories.ClienteRepository;
import com.example.demo.cursomc.security.UserSS;

public class UserDetailsServiceImplem implements UserDetailsService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Cliente cli = clienteRepository.findByEmailIgnoreCase(email);
		if(cli == null) {
			throw new UsernameNotFoundException(email);
			
		}
		return new UserSS(cli.getId(), cli.getEmail(), cli.getSenha(), cli.getPerfis());
	}

}
