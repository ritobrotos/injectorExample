package example.interfaceBinding;

import java.util.List;
import com.google.inject.Inject;

public class OrderPortal {

	private OrderService service;
	
	@Inject
	public OrderPortal(OrderService svc) {
		service = svc;
	}
	
	public void newOrder(List<String> itemList) {
		service.createOrder(itemList);
	}
}