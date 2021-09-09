package OrderTypes;
import PaymentTypes.*;

public class ComputerOrders implements OrderType {
	private String ID;
	private static int numOrders = 0;
	private PaymentType payment;
	
	
	public ComputerOrders(int p) {
		numOrders++;
		ID = "COMP" + numOrders;
		payment = new Cash(p);
	}

	public ComputerOrders(PaymentType pt) {
		numOrders++;
		ID = "COMP" + numOrders;
		payment = pt;
	}
	@Override
	public void printOrder() {
		// TODO Auto-generated method stub
		System.out.println("********************");
		System.out.println("* ORDER: " + ID);
		System.out.println("* PRICE: " + payment.getPrice());
		System.out.println("* PAYMENT METHOD: " + (payment.getClass() == Cash.class ? "Cash" : "CC"));
		System.out.println("********************");
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	public void setPaymentType(PaymentType pt) {
		payment = pt;
	}

	public static int getNumOrders() {
		// TODO Auto-generated method stub
		return numOrders;
	}

}
