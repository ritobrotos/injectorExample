package service.impl;

import java.util.List;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import service.MessageService;

public class MessageSender {
	
	private MessageService service;
	
	@Inject
	public MessageSender(MessageService svc) {
		this.service = svc;
	}
	
	public void sendMessage(String messageType, String msg) {
		List<String> recipientList = null;
		if (messageType.equalsIgnoreCase("email")) {
			recipientList = getEmailRecipients();
		} else if (messageType.equalsIgnoreCase("fbmessage")) {
			recipientList = getFacebookRecipients();
		}
		
		for(String recipient: recipientList) {
			service.sendMessage(msg, recipient);
		}
	}
	
	private List<String> getEmailRecipients() {
		List<String> emailList = Lists.newArrayList("email+1@gmail.com", "email+2@gmail.com", "email+3@gmail.com");
		return emailList;
	}
	
	private List<String> getFacebookRecipients() {
		List<String> fbUserIdList = Lists.newArrayList("123D234R", "345T819R", "897P384K");
		return fbUserIdList;
	}
	
}
