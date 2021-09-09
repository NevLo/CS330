import java.util.Scanner;

import OrderTypes.*;
import PaymentTypes.*;



public class Main {
	public static void main(String[] args) {
		Shop MallKiosk = new Kiosk();
		Shop SuperStore = new Store();
		String ticket1 = "ticketAAA";
		int p = 5;
		SuperStore.takeOrder(new Cash(p));
		SuperStore.printOrder(0);
		
		MallKiosk.takeOrder(ticket1, p);
		MallKiosk.printOrder(0);
		MallKiosk.takeOrder("ThisIsATicket", 12);
		MallKiosk.printOrder(1);
		
		SuperStore.takeOrder(new CreditCard(13));
		SuperStore.printOrder(1);
	}
}
