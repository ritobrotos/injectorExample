package service.impl.order;

import java.util.List;

import com.google.inject.Inject;

import service.MessageService;
import service.OrderService;

public class OrderPortal {

	private OrderService service;
	
	@Inject
	public OrderPortal(OrderService svc) {
		service = svc;
	}
	
	public void orderListener(String orderType, List<String> itemList) {
		if(orderType.equalsIgnoreCase("new")) {
			newOrder(itemList);
		}
	}
	
	public void newOrder(List<String> itemList) {
		service.createOrder(itemList);
	}
	
	public void cancelOrder() {
		
	}
	
	public void editOrder() {
		
	}
	
	public void viewOrder() {
		
	}
	
}
