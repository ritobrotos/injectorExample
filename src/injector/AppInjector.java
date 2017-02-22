package injector;

import com.google.inject.AbstractModule;

import service.MessageService;
import service.impl.EmailService;

public class AppInjector extends AbstractModule {

	@Override
	protected void configure() {
		bind(MessageService.class).to(EmailService.class);
	}

}
