
public class Bicycle extends Vehicle{

	public Bicycle() { 
		this.Wheels = new Wheel[2];
		for(int i = 0; i < Wheels.length; i++) {
			Wheels[i] = new Wheel(130.0f, 9.525f);
		}
	}
	
	
	public Bicycle(String Name, String Colour) {
		this.Name = Name;
		this.Colour = Colour;
		this.Wheels = new Wheel[2];
		for(int i = 0; i < Wheels.length; i++) {
			Wheels[i]  = new Wheel(130.0f, 9.525f);
		}
	}
	
	public void Pedal() {
		System.out.println("Bicycle Pedaled!");
	}
}
