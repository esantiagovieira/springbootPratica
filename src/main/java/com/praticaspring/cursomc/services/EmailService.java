package com.praticaspring.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.praticaspring.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
