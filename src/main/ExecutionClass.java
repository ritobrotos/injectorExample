package main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import injector.AppInjector;
import service.impl.basic.ParentService;
import java.util.List;
import com.google.common.collect.Lists;
import service.impl.message.MessageSender;
import service.impl.order.OrderPortal;
import service.passParameter.CallingService;

public class ExecutionClass {

	public static void main(String[] args) {
		executePassParameterExample();
	}
	
	private static void executePassParameterExample() {
		Injector injector = Guice.createInjector(new AppInjector());
		CallingService service = injector.getInstance(CallingService.class);
		service.callingMethod();
	}
	
	private static void executeBasicServiceExample() {
		Injector injector = Guice.createInjector(new AppInjector());
		
		ParentService service = injector.getInstance(ParentService.class);
		service.parentMethod();
	}

	private static void executeMessageServiceExample() {
		/*
		 * Guice.createInjector() takes your Modules, and returns a new Injector
		 * instance. Most applications will call this method exactly once, in
		 * their main() method.
		 */
		Injector injector = Guice.createInjector(new AppInjector());

		MessageSender msgService = injector.getInstance(MessageSender.class);
		msgService.sendMessage("fbmessage", "Meassage Body");
	}
	
	private static void executeOrderServiceExample() {
		Injector injector = Guice.createInjector(new AppInjector());
		OrderPortal order = injector.getInstance(OrderPortal.class);
		
		List<String> itemList = Lists.newArrayList();
		order.orderListener("new", itemList);
	}
	
}
