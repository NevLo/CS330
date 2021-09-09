package OrderTypes;

import PaymentTypes.*;

public class TicketOrders implements OrderType {

	private String ID;
	private static int numOrders = 0;
	private PaymentType payment;
	
	public TicketOrders(String ID, int price) {
		this.ID = ID;
		payment = new Cash(price);
		numOrders++;
		
	}
	@Override
	public void printOrder() {
		System.out.println("********************");
		System.out.println("* ORDER: " + ID);
		System.out.println("* PRICE: " + payment.getPrice());
		System.out.println("* PAYMENT METHOD: " + (payment.getClass() == Cash.class ? "Cash" : "CC"));
		System.out.println("********************");
		
	}
	public static int getNumOrders() {
	
		return numOrders;
	}
	
	
}
