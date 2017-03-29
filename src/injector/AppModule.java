package injector;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import service.passParameter.CalledServiceFactory;
import service.MessageService;
import service.OrderService;
import service.impl.message.EmailService;
import service.impl.order.HomeDeliveryOrder;

public class AppModule extends AbstractModule {

	@Override
	protected void configure() {	
		bind(MessageService.class).to(EmailService.class);
		bind(OrderService.class).to(HomeDeliveryOrder.class);
		
		install(new FactoryModuleBuilder()
			     .build(CalledServiceFactory.class));
	}
}