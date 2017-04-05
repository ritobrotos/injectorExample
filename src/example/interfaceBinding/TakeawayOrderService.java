package example.interfaceBinding;

import java.util.List;

public class TakeawayOrderService implements OrderService {

	@Override
	public boolean createOrder(List<String> itemList) {
		System.out.println("Order Taken. Order size: " + itemList.size());
		return true;
	}
}