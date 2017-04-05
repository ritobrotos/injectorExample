package injector;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

import example.interfaceBinding.TakeawayOrderService;
import example.interfaceBinding.OrderService;
import example.passParameter.CalledServiceFactory;
import service.MessageService;
import service.impl.message.EmailService;

public class AppModule extends AbstractModule {

	@Override
	protected void configure() {	
		bind(OrderService.class).to(TakeawayOrderService.class);
		bind(MessageService.class).to(EmailService.class);
		
		install(new FactoryModuleBuilder()
			     .build(CalledServiceFactory.class));
	}
}