package PaymentTypes;


public class Cash implements PaymentType {
	int price;
	
	public Cash(int p) {
		price = p;
	}
	
	
	
	
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
