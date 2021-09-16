package Decorators;
import Trees.Tree;

public class BallsSilver extends TreeDecorator {

	public BallsSilver(Tree mytree) {
		tree = mytree;
		cost = 3;
		name = "Silver Balls";
	}

}
