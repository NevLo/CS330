
public class Waitress {
	private Cook cook;
	
	public Waitress(Cook c) {
		cook = c;
	}
	
	public void takeOrder(OrderSlip OS) {
		cook.orderUp(OS);
	}
	
	
}
