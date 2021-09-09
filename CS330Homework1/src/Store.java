import OrderTypes.*;
import PaymentTypes.*;

public class Store extends Shop {
	OrderType orders[];
	public Store() {
		orders = new OrderType[100];
	}
	
	public void takeOrder(PaymentType pt) {
		orders[ComputerOrders.getNumOrders()] = new ComputerOrders(pt);
	}
	public void printOrder(int i) {
		orders[i].printOrder();
	}
}
