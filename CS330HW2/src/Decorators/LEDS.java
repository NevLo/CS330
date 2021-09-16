package Decorators;
import Trees.Tree;

public class LEDS extends TreeDecorator {

	public LEDS(Tree mytree) {
		tree = mytree;
		cost = 10;
		name = "L.E.D.s";
	}

}
