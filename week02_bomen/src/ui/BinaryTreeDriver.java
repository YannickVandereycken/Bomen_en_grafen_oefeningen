package ui;

import domain.BinaryTree;

public class BinaryTreeDriver {

    public static void main(String[] args) {
		/*BinaryTree<String> nodeD = new BinaryTree<>("D");
		BinaryTree<String> nodeF = new BinaryTree<>("F");
		BinaryTree<String> nodeB = new BinaryTree<>("B");
		BinaryTree<String> nodeH = new BinaryTree<>("H");
		
		// knoop A heeft links D en rechts F
		BinaryTree<String> nodeA = new BinaryTree<>("A",nodeD, nodeF);
		// knoop E heeft links H
		BinaryTree<String> nodeE = new BinaryTree<>("E",nodeH,null);
		// knoop G heeft links E en rechts B
		BinaryTree<String> nodeG = new BinaryTree<>("G",nodeE, nodeB);
		
		// boom heeft root C en heeft links A en rechts G
		BinaryTree<String> boom = new BinaryTree<>("C",nodeA, nodeG);
		 */

        BinaryTree<String> nodeC = new BinaryTree<>("C");
        BinaryTree<String> nodeE = new BinaryTree<>("E");
        BinaryTree<String> nodeH = new BinaryTree<>("H");
        BinaryTree<String> nodeA = new BinaryTree<>("A");

        // knoop A heeft links D en rechts F
        BinaryTree<String> nodeD = new BinaryTree<>("D", nodeC, nodeE);
        // knoop E heeft links H
        BinaryTree<String> nodeB = new BinaryTree<>("B", nodeA, nodeD);
        // knoop G heeft links E en rechts B
        BinaryTree<String> nodeI = new BinaryTree<>("I", nodeH, null);
        BinaryTree<String> nodeG = new BinaryTree<>("G", null, nodeI);

        // boom heeft root C en heeft links A en rechts G
        BinaryTree<String> boom = new BinaryTree<>("F", nodeB, nodeG);

        boom.printPreorder();
        System.out.println("\n");
        boom.printInorder();
        System.out.println("\n");
        boom.printPostorder();
        System.out.println("\n");
        System.out.println(boom.CountNodes());
        System.out.println("\n");
        System.out.println(boom.getDepth());
        System.out.println("\n");
        System.out.println(boom.countLeaves());
        System.out.println("\n");
        boom.getDataLeaves();
        System.out.println("\n");
        System.out.println(boom.contains("D"));
        System.out.println(boom.contains("H"));
        System.out.println(boom.contains("F"));
        System.out.println(boom.contains("Q"));
    }

}
