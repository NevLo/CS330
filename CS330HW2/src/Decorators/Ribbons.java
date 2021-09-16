package Decorators;
import Trees.Tree;

public class Ribbons extends TreeDecorator {

	public Ribbons(Tree mytree) {
		tree = mytree;
		cost = 2;
		name = "Ribbons";
	}

}
