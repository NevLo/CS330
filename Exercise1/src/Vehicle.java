
public abstract class Vehicle {
	protected String Colour;
	protected String Name;
	protected Wheel[] Wheels;
	
	
	public String GetColour() {
		return Colour;
	}
	public void SetColor(String Colour) {
		this.Colour = Colour;
	}
	
	public String GetName() {
		return Name;
	}
	public void SetName(String Name) {
		this.Name = Name;
	}
	
	public void PrintWheelStats() {
		System.out.println("Tire Statistics of " + this.Name);
		for(Wheel w : Wheels) {
			System.out.printf("Tire Pressure: %f\nTread Depth:%f\n\n", w.GetTirePressure(), w.GetTreadLength());
		}
	}
	
	
	
	
	
}
