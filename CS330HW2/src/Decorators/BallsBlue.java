package Decorators;
import Trees.Tree;

public class BallsBlue extends TreeDecorator {

	public BallsBlue(Tree mytree) {
		tree = mytree;
		cost = 2;
		name = "Blue Balls";
	}

}
