package com.xworkz.utility;

import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class JavaMailSender {

	public static void main(String[] args) {
		JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();
		mailSenderImpl.setHost("smtp.gmail.com");
		mailSenderImpl.setPort(587);
		mailSenderImpl.setUsername("rakshithammj@gmail.com");
		mailSenderImpl.setPassword("");
		
		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.debug", "true");
		
		mailSenderImpl.setJavaMailProperties(javaMailProperties);
		
		String []bccs = {"rakshi.xworkz@gmail.com","mmjrajeshwari@gmail.com"};
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("rakshithammj@gmail.com");
		message.setTo("rakshithammjcse.rymec@gmail.com");
		message.setBcc(bccs);
		message.setSubject("Demo Mail Sender");
		message.setText("Hello Everyone \n I am Rakshitha M M J \n From Xworkz \n");
		
		mailSenderImpl.send(message);
	}
}
