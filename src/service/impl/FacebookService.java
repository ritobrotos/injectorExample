package service.impl;

import service.MessageService;

public class FacebookService implements MessageService {

	public boolean sendMessage(String msg, String recipient) {
		System.out.println("Facebook Content: " + msg + " to the receipient: " + recipient);
		return true;
	}
}
