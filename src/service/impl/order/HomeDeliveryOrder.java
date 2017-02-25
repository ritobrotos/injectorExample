package service.impl.order;

import java.util.List;

import com.google.inject.Inject;

import service.MessageService;
import service.OrderService;

public class HomeDeliveryOrder implements OrderService {
	
	private MessageService msgService;
	
	@Inject
	public HomeDeliveryOrder(MessageService msgSvc) {
		msgService = msgSvc;
	}
	
	@Override
	public boolean createOrder(List<String> itemList) {
		System.out.println("Home Delivery Order Taken.");
		msgService.sendMessage("bla 1", "bla 2");
		return true;
	}

}
