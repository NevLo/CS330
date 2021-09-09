import OrderTypes.*;
import PaymentTypes.*;

public abstract class Shop {
	OrderType ordertype;
	PaymentType paymenttype;
	
	public Shop() {}
	public void printOrder(int i) {
	}
	public void takeOrder(PaymentType pt) {}
	public void takeOrder(String ticket1, int p) {
		// TODO Auto-generated method stub
		
	}
}
