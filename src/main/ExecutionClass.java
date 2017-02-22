package main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import injector.AppInjector;
import service.impl.MessageSender;

public class ExecutionClass {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppInjector());
		MessageSender msgService = injector.getInstance(MessageSender.class);
		msgService.sendMessage("fbmessage", "This is meassage body");
	}

}
