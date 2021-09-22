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
		Tree tree2 = new FraserFir();
		tree2 = new Star(tree2);
		tree2 = new Star(tree2);
		tree2 = new BallsBlue(tree2);
		tree2 = new BallsRed(tree2);
		tree2 = new BallsSilver(tree2);
		tree2 = new Ribbons(tree2);
		tree2 = new Ruffles(tree2);
		tree2 = new LEDS(tree2);
		tree2 = new Lights(tree2);
		printtree(tree2);
		
		tree2 = new BalsamFir();
		printtree(tree2);
	}

	private static void printtree(Tree mytree) {
		System.out.println(mytree.getName() + " costs $" + String.format("%d.00", mytree.getCost()));
	}
}
