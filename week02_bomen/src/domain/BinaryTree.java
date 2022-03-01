package domain;

public class BinaryTree<E> {
    private E data;
    private BinaryTree<E> leftTree, rightTree;

    public BinaryTree(E data) {
        this(data, null, null);
    }

    public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
        if (data == null) {
            throw new IllegalArgumentException();
        }
        this.data = data;
        this.leftTree = leftTree;
        this.rightTree = rightTree;
    }

    public void printPreorder() {
        System.out.print(this.data + " ");
        if (this.leftTree != null) this.leftTree.printPreorder();
        if (this.rightTree != null) this.rightTree.printPreorder();
    }

    public void printInorder() {
        if (this.leftTree != null) this.leftTree.printInorder();
        System.out.print(this.data + " ");
        if (this.rightTree != null) this.rightTree.printInorder();
    }

    public void printPostorder() {
        if (this.leftTree != null) this.leftTree.printPostorder();
        if (this.rightTree != null) this.rightTree.printPostorder();
        System.out.print(this.data + " ");
    }

    public int CountNodes() {
        int aantal = 1;
        if (this.leftTree != null) aantal += this.leftTree.CountNodes();
        if (this.rightTree != null) aantal += this.rightTree.CountNodes();
        return aantal;
    }

    public int getDepth() {
        int depth = 1;
        int depthright = 0;
        int depthleft = 0;
        int max = 0;
        if (this.leftTree != null) depthleft = this.leftTree.getDepth();
        if (this.rightTree != null) depthright = this.rightTree.getDepth();
        if (depthleft > depthright) max = depthleft;
        else max = depthright;
        return depth + max;
    }

    public boolean isLeaf() {
        boolean leafy = false;
        if (this.leftTree == null && this.rightTree == null) leafy = true;
        return leafy;
    }

    public int countLeaves() {
        int aantal = 0;
        if (this.isLeaf()) aantal = 1;
        if (this.leftTree != null) aantal += this.leftTree.countLeaves();
        if (this.rightTree != null) aantal += this.rightTree.countLeaves();
        return aantal;
    }

    public void getDataLeaves() {
        if (this.isLeaf()) System.out.print(this.data + " ");
        if (this.leftTree != null) this.leftTree.getDataLeaves();
        if (this.rightTree != null) this.rightTree.getDataLeaves();
    }

    public boolean contains(E data) {
        boolean same = false;
        if (this.data.equals(data)) same = true;
        if (this.leftTree != null && this.leftTree.contains(data)) same = true;
        if (this.rightTree != null && this.rightTree.contains(data)) same = true;
        return same;
    }
}
