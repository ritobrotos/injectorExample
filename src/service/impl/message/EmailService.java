package service.impl.message;

import service.MessageService;

public class EmailService implements MessageService {

	public boolean sendMessage(String msg, String recipient) {
		System.out.println("Email Content: " + msg + " || Receipient: " + recipient);
		return true;
	}
}
