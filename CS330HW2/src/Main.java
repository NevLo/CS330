import Decorators.*;
import Trees.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		
		Tree mytree = new BlueSpruce();
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new LEDS(mytree);
		printtree(mytree);
		
		//EXPECTED OUTPUT:
		//Tree already has a star!
		//Blue Spruce tree decorated with, a Star, Ruffles, Ruffles costs $26.00
		
		
		
	}

	private static void printtree(Tree mytree) {
		System.out.println(mytree.getName() + " costs $" + String.format("%d.00", mytree.getCost()));
	}
}
