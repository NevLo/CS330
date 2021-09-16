package Decorators;
import Trees.BalsamFir;
import Trees.BlueSpruce;
import Trees.DouglasFir;
import Trees.FraserFir;
import Trees.Tree;

public abstract class TreeDecorator extends Tree {
	protected Tree tree;
	
	public int getCost() {
		return tree.getCost() + cost;
	}
	
	public String getName() {
		boolean treeNotDecorator = tree.getClass() == BalsamFir.class 
				|| tree.getClass() == DouglasFir.class
				|| tree.getClass() == FraserFir.class
				|| tree.getClass() == BlueSpruce.class;
		return tree.getName() + (treeNotDecorator ? "" : (name.equals("") ? "" : ", ") ) + name;
	}
	
	public Tree getTree() {
		return tree;
	}
	
}
