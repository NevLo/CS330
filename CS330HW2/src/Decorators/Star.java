package Decorators;
import Trees.*;

public class Star extends TreeDecorator {

	public Star(Tree mytree) {
		tree = mytree;
		if(checkForStars(mytree)) {
			cost = 0;
			name = "";
			System.out.println("Tree already has a star!");
			return;
		}
		cost = 4;
		name = "a Star";
	}
	private boolean checkForStars(Tree mytree) {
		if(mytree.getClass() == BalsamFir.class 
				|| mytree.getClass() == DouglasFir.class
				|| mytree.getClass() == FraserFir.class
				|| mytree.getClass() == BlueSpruce.class)
			return false;
		return mytree.getClass() == Star.class || checkForStars(((TreeDecorator) mytree).getTree());
	}
	
}
