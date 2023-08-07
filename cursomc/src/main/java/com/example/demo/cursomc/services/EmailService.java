package com.example.demo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.example.demo.cursomc.domain.Pedido;

public interface EmailService {
	
	void  sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
