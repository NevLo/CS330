package Decorators;
import Trees.Tree;

public class BallsRed extends TreeDecorator {

	public BallsRed(Tree mytree) {
		tree = mytree;
		cost = 1;
		name = "Red Balls";
	}

}
