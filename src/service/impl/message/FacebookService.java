package service.impl.message;

import service.MessageService;

public class FacebookService implements MessageService {

	public boolean sendMessage(String msg, String recipient) {
		System.out.println("Facebook Content: " + msg + " || Receipient: " + recipient);
		return true;
	}
}
