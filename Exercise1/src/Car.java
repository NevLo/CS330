
public class Car extends Vehicle{

	public Car() {
		this.Wheels = new Wheel[4];
		for(int i = 0; i < Wheels.length; i++) {
			Wheels[i] = new Wheel();
		}
	}
	public Car(String Name, String Colour) {
		this.Name = Name;
		this.Colour = Colour;
		this.Wheels = new Wheel[4];
		for(int i = 0; i < Wheels.length; i++) {
			Wheels[i] = new Wheel();
		}
	}
	
	public void Start() {
		System.out.println("Starting The Car!");
	}
	
}
