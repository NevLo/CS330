package Decorators;
import Trees.Tree;

public class Lights extends TreeDecorator {

	public Lights(Tree mytree) {
		tree = mytree;
		cost = 5;
		name = "Lights";
	}

}
