package Decorators;
import Trees.Tree;

public class Ruffles extends TreeDecorator {

	public Ruffles(Tree mytree) {
		tree = mytree;
		cost = 1;
		name = "Ruffles";
	}

}
