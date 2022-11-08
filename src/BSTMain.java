public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree BTree = new BinarySearchTree();
        BTree.insert(40);
        BTree.insert(20);
        BTree.insert(60);
        BTree.insert(10);
        BTree.insert(30);
        BTree.insert(50);
        BTree.insert(70);

        boolean sample = BTree.checkIfSumPresent(BTree.root, BTree.root, 130);
        if(!sample)
            System.out.println("nodes are not found");

    }

}
