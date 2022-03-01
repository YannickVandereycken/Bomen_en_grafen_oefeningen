package ui;

import domain.BinarySearchTree;

public class BinarySearchTreeDriver {

    public static void main(String[] args) {
        BinarySearchTree<Integer> boom = new BinarySearchTree<Integer>(6);
        boom.addNode(4);
        boom.addNode(8);
        boom.addNode(3);
        boom.addNode(5);
        boom.addNode(7);
        boom.addNode(9);

        printBoomInfo(boom);
    }

    private static void printBoomInfo(BinarySearchTree<Integer> boom) {
        if (boom == null) System.out.println("Lege boom");
        else {
            boom.printInorder();
            System.out.println();
            System.out.println("De grootste waarde uit deze boom = " + boom.searchGreatest());
            System.out.println("De kleinste waarde uit deze boom = " + boom.searchSmallest());
            System.out.println(boom.lookup(7));
            //boom.removeNode(8);
            //boom.printInorder();
            //boom.cleanUp();
            //System.out.println("\n");
            //boom.printInorder();
            boom.addNode(10);
            boom.addNode(11);
            boom.printInorder();
            boom.removeNode(9);
            boom.cleanUp();
            boom.removeNode(11);
            boom.cleanUp();
            boom.removeNode(6);
            boom.cleanUp();
            System.out.println("\n");
            boom.printInorder();
        }
    }
}
