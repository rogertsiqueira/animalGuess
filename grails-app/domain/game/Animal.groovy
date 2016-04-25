package game;

public class Animal {

	String ask;
	Animal left;
	Animal right;


	static constraint = {
	}

	/**
	*Method responsable for check if the atributes left and right of node are nulls
	*@Return true if is leaf or false if it isn't leaf
	*/
	boolean isLeaf() {
		return (left == null) && (right == null);
	}
}
