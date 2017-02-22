package service.impl;

import service.MessageService;

public class EmailService implements MessageService {

	public boolean sendMessage(String msg, String recipient) {
		System.out.println("Email Content: " + msg + " to the receipient: " + recipient);
		return true;
	}
}
