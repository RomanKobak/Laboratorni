package test;

import java.io.File;

import com.mykush.DecisionTree;

public class Test {

	public static void main(String[] args) {
		DecisionTree tree = new DecisionTree();
		tree.train(new File("resources/inputData.psv"));
		System.out.println(tree.getRootNode());
		System.out.println(tree.classify("Raining|Moderate|High|Yes"));
	}
}
