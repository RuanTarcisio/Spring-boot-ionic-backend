package com.example.demo.cursomc.services.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.cursomc.domain.Cliente;
import com.example.demo.cursomc.domain.enums.TipoCliente;
import com.example.demo.cursomc.dto.ClienteNewDTO;
import com.example.demo.cursomc.repositories.ClienteRepository;
import com.example.demo.cursomc.resources.exception.FieldMessage;
import com.example.demo.cursomc.services.validation.utils.BR;


public class ClienteInsertValidator implements ConstraintValidator<ClienteInsert, ClienteNewDTO> {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void initialize(ClienteInsert ann) {
	}



	@Override
	public boolean isValid(ClienteNewDTO objDto, ConstraintValidatorContext context) {
		List<FieldMessage> list = new ArrayList<>();

		if(objDto.getTipoCliente().equals(TipoCliente.PESSOA_FISICA.getCod())&& !BR.isValidCPF(objDto.getCpfOrCnpj())) {
			list.add(new FieldMessage("cpfOrCnpj", "CPF invalido"));
		}
		if(objDto.getTipoCliente().equals(TipoCliente.PESSOA_JURIDICA.getCod())&& !BR.isValidCNPJ(objDto.getCpfOrCnpj())) {
			list.add(new FieldMessage("cpfOrCnpj", "CNPJ invalido"));
		}
		
		Cliente aux = clienteRepository.findByEmailIgnoreCase(objDto.getEmail());
		if(aux != null) {
			list.add(new FieldMessage("email", "E-mail ja cadastrado."));
		}
		
		
		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}