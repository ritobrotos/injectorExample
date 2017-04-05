package example.basic;

import com.google.inject.Inject;

public class ParentService {

	ChildService service;
	
	@Inject
	public ParentService(ChildService svc) {
		service = svc;
	}
	
	public void parentMethod() {
		service.childMethod();
	}
}
