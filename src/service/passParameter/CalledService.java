package service.passParameter;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

public class CalledService {
	
	private String variable_value;
	
	@Inject
	public CalledService(@Assisted String parameter) {
		variable_value = parameter;
	}
	
	public void printValue() {
		System.out.println(variable_value);
	}
}
