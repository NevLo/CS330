package Trees;

public abstract class Tree {
	protected String name;
	protected int cost;
	
	public int getCost() {
		return cost;
	}
	public String getName() {
		return name + " decorated with: ";
		
	}
	
	
}
