
public class main {
	public static void main(String args[]) {
		Car pinto = new Car("Wayne's Ford Pinto","Blue");
		Bicycle BMX = new Bicycle("Garth's BMX Bike","Silver");
		
		System.out.println(pinto.GetName() + " is the colour " + pinto.GetColour()+'\n');
		System.out.println(BMX.GetName() + " is the colour " + BMX.GetColour() +'\n');
		
		pinto.Start();
		System.out.println();
		BMX.Pedal();
		System.out.println();
		
		pinto.PrintWheelStats();
		BMX.PrintWheelStats();
		
		
		Vehicle NewCar = new Car();
		NewCar.SetName("Fancy Schmancy Car");
		NewCar.SetColor("Black");
		
		NewCar.PrintWheelStats();
		
		NewCar = new Bicycle("Jank-cycle", "Brown");
		
		NewCar.PrintWheelStats();
		
	}
}
