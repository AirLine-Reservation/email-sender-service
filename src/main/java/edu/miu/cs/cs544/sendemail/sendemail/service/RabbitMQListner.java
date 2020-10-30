package edu.miu.cs.cs544.sendemail.sendemail.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQListner implements MessageListener {

	public void onMessage(Message message) {
		System.out.println("EmailSent to " + new String(message.getBody()));
	}

}