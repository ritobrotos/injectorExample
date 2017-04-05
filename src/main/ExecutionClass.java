package main;

import com.google.inject.Guice;
import com.google.inject.Injector;

import example.basic.ParentService;
import example.fieldInjection.UserService;
import example.interfaceBinding.OrderPortal;
import example.passParameter.CallingService;
import injector.AppModule;

import java.util.List;
import com.google.common.collect.Lists;
import service.impl.message.MessageSender;

public class ExecutionClass {

	public static void main(String[] args) {
		executeFieldInjectionExample();
	}
	
	private static void executeFieldInjectionExample() {
		Injector injector = Guice.createInjector(new AppModule());
		UserService service = injector.getInstance(UserService.class);
		service.getUserInfo();
	}
	
	private static void executeInterfaceBindingExample() {
		Injector injector = Guice.createInjector(new AppModule());
		OrderPortal order = injector.getInstance(OrderPortal.class);
		
		List<String> itemList = Lists.newArrayList();
		order.newOrder(itemList);
	}
	
	private static void executePassParameterExample() {
		Injector injector = Guice.createInjector(new AppModule());
		CallingService service = injector.getInstance(CallingService.class);
		service.callingMethod();
	}
	
	private static void executeBasicServiceExample() {
		Injector injector = Guice.createInjector(new AppModule());
		
		ParentService service = injector.getInstance(ParentService.class);
		service.parentMethod();
	}

	private static void executeMessageServiceExample() {
		/*
		 * Guice.createInjector() takes your Modules, and returns a new Injector
		 * instance. Most applications will call this method exactly once, in
		 * their main() method.
		 */
		Injector injector = Guice.createInjector(new AppModule());

		MessageSender msgService = injector.getInstance(MessageSender.class);
		msgService.sendMessage("fbmessage", "Meassage Body");
	}
}
