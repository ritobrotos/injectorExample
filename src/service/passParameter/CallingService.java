package service.passParameter;

import com.google.inject.Inject;

public class CallingService {
	
	@Inject
	private CalledServiceFactory factory;

	public void callingMethod() {
		CalledService service = factory.create("someValue");
		service.printValue();
	}
}
