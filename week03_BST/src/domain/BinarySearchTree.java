package domain;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {

    public BinarySearchTree(E data, BinarySearchTree<E> leftTree, BinarySearchTree<E> rightTree) {
        super(data, leftTree, rightTree);
    }

    public BinarySearchTree(E data) {
        super(data);
    }

    public boolean lookup(E data) {
        if (this.data.equals(data)) return true;
        if (this.data.compareTo(data) > 0) return this.leftTree != null && this.leftTree.lookup(data);
        if (this.data.compareTo(data) < 0) return this.rightTree != null && this.rightTree.lookup(data);
        return false;
    }

    public boolean addNode(E data) {
        if (this.data.equals(data)) return false;
        else if (this.data.compareTo(data) > 0 && this.leftTree == null) {
            this.leftTree = new BinarySearchTree<E>(data);
            return true;
        } else if (this.data.compareTo(data) > 0 && this.leftTree != null) this.leftTree.addNode(data);
        else if (this.data.compareTo(data) < 0 && this.rightTree == null) {
            this.rightTree = new BinarySearchTree<E>(data);
            return true;
        } else if (this.data.compareTo(data) < 0 && this.rightTree != null) this.rightTree.addNode(data);
        return false;
    }

    public boolean removeNode(E data) {
        if (this.data.equals(data)) {
            if (this.isLeaf()) {
                this.data = null;
                return true;
            } else if (this.leftTree != null) {
                E gl = this.leftTree.searchGreatest();
                this.data = gl;
                this.leftTree.removeNode(gl);
                return true;
            } else {
                E kr = this.rightTree.searchSmallest();
                this.data = kr;
                this.rightTree.removeNode(kr);
                return true;
            }

        } else if (this.data.compareTo(data) > 0) {
            if (this.leftTree == null) return false;
            else return this.leftTree.removeNode(data);
        } else {
            if (this.rightTree == null) return false;
            else return this.rightTree.removeNode(data);
        }
    }

    public E searchSmallest() {
        if (this.leftTree == null) return this.data;
        else return this.leftTree.searchSmallest();
    }

    public E searchGreatest() {
        if (this.rightTree == null) return this.data;
        else return this.rightTree.searchGreatest();
    }

    public boolean isLeaf() {
        boolean leafy = false;
        if (this.leftTree == null && this.rightTree == null) leafy = true;
        return leafy;
    }

    public void cleanUp() {
        if (this.rightTree != null && this.rightTree.isLeaf() && this.rightTree.data == null) {
            this.rightTree = null;
        }
        if (this.leftTree != null && this.leftTree.isLeaf() && this.leftTree.data == null) {
            this.leftTree = null;
        } else {
            if (this.leftTree != null) this.leftTree.cleanUp();
            if (this.rightTree != null) this.rightTree.cleanUp();
        }
    }
}


