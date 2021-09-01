
public class Wheel {
	private float TirePressure;
	private float TreadLength;
	
	public Wheel() {
		this.TirePressure = 32.0f;
		this.TreadLength = 9.0f;
	}
	public Wheel(float TirePressure, float TreadLength) {
		this.TirePressure = TirePressure;
		this.TreadLength = TreadLength;
	}
	
	public float GetTirePressure() {
		return TirePressure;
	}
	public void SetTirePressure(float TirePressure) {
		this.TirePressure = TirePressure;
	}
	
	public float GetTreadLength() {
		return TreadLength;
	}
	public void SetTreadLength(float TreadLength) {
		this.TreadLength = TreadLength;
	}
}
