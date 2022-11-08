public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    //function to insert a key in bst
    Node insertKey(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }

        if(data < root.data)
            root.left = insertKey(root.left, data);
        else if(data > root.data)
            root.right = insertKey(root.right, data);

        return root;
    }

    boolean checkIfSumPresent(Node root, Node temp, int target) {
        if(temp == null)
            return false;

        return search(root, temp, target - temp.data)
                || checkIfSumPresent(root, temp.left, target)
                || checkIfSumPresent(root, temp.right, target);
    }
    boolean search(Node root, Node temp, int k) {
        if(root == null)
            return false;

        Node c = root;
        boolean flag = false;
        while(c != null && flag != true) {
            if(c.data ==k && temp != c) {
                flag = true;
                System.out.println("Pair is: " + c.data + "," + temp.data);
                return true;
            }
            else if(k < c.data)
                c = c.left;
            else
                c = c.right;
        }
        return false;
    }

    public void insert(int key) {
        root = insertKey(root, key);
    }
}
