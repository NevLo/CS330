import OrderTypes.*;
import PaymentTypes.*;

public class Kiosk extends Shop {
	OrderType orders[];
	public Kiosk() {
		orders = new TicketOrders[100];
	}
	public void printOrder(int i) {
		orders[i].printOrder();
	}
	
	public void takeOrder(String ID, int p) {
		orders[TicketOrders.getNumOrders()] = new TicketOrders(ID, p);
	}
}
