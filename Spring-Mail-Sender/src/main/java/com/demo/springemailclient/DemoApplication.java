package com.demo.springemailclient;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoApplication {
   
	@Autowired
	private EmailSenderService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
	// service.sendSimpleEmail( "aakashchakraborty75@gmail.com",  "This is just a followup Mail",  "Hey, Stay Safe in this time of pandemic");
	
		service.sendEmailWithAttachment("aakashchakraborty75@gmail.com", "This is just a followup Mail with attachment", "Motivational Mail", "C:\\Users\\Aakash chakraborty\\Pictures\\Saved Pictures\\MyPic.jpg");

	}
}
