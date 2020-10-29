package Algorithm;

public class BinarySearchTree {
    private static Node root = null;

    public BinarySearchTree() {}

    public void insert(int value) {
        root = insertRecursively(root, value);
    }

    private Node insertRecursively(Node root, int data) {
        if (root == null) {
            System.out.println("A new node is created with data: " + data);
            return new Node(data);
        }

        if (data < root.data) {
            System.out.println("Traversal the left sub tree. the new node data: " + data);
            root.left = insertRecursively(root.left, data);
        } else if (data > root.data) {
            System.out.println("Traversal the right sub tree. the new node data: " + data);
            root.right = insertRecursively(root.right, data);
        } else {
            // data already exists
            return root;
        }
        System.out.println("The root root data: " + root.data);
        return root;
    }

    public void search(int data) {
        searchRecursively(root, data);
    }

    private Node searchRecursively(Node root, int data) {
        if (root == null) {
            return root;
        }
        if (root.data == data) {
            System.out.println("The node is found. the data: " + root.data);
            return root;
        }

        if (root.data > data)
        {
            return searchRecursively(root.left, data);
        }
        return searchRecursively(root.right, data);
    }
}
