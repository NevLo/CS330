package PaymentTypes;
public class CreditCard implements PaymentType{

	int price;
	public CreditCard(int p){
		price = p;
	}
	
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	
	
}
