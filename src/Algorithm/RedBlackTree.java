package Algorithm;

public class RedBlackTree {
    private static Node root = null;
    private Node.Color color;

    public RedBlackTree() {
        insert(5, color.BLACK);
        insert(10, color.RED);
        insert(6, color.BLACK);
        insert(2, color.RED);
        insert(1, color.RED);
        insert(4, color.BLACK);
        insert(11, color.BLACK);
        insert(13, color.RED);
    }

    public void insert(int value, Node.Color color) {
        root = insertRecursively(root, value, color);
    }

    private Node insertRecursively(Node node, int data, Node.Color color ) {
        if (node == null) {
            System.out.println("A new node is created with data: " + data + " color: " + color);
            return new Node(data, color);
        }

        if (data < node.data) {
            System.out.println("Traversal the left sub tree. the new node data: " + data);
            node.left = insertRecursively(node.left, data, color);
        } else if (data > node.data) {
            System.out.println("Traversal the right sub tree. the new node data: " + data);
            node.right = insertRecursively(node.right, data, color);
        } else {
            // data already exists
            return node;
        }

        fixInsert(node);
        System.out.println("The root root data: " + root.data);
        return root;
    }

    private void fixInsert(Node newNode) {
        while (newNode.parent != null && newNode.parent.color == Node.Color.RED) { // Till there is Red-Red violation
            if (newNode.parent == newNode.parent.parent.left) { // case 1, 2, 3: the parent of newNode is the left child of grandparent
                Node uncleNode = newNode.parent.parent.right;
                if (uncleNode.color == Node.Color.RED) { // case 1: uncleNode is RED color
                    System.out.println("case 1: uncleNode is RED color");
                    newNode.parent.color = Node.Color.BLACK;
                    uncleNode.color = Node.Color.BLACK;
                    newNode.parent.parent.color = Node.Color.RED;
                    newNode = newNode.parent.parent;
                } else { // case 2, 3: uncleNode is BLACK color
                    if (newNode == newNode.parent.right) { // case 2
                        System.out.println("case 2: uncleNode is BLACK color and new node is right child");
                        newNode = newNode.parent;
                        RotateLeft(newNode);
                    } else { // case 3
                        System.out.println("case 3: uncleNode is BLACK color and new node is left child");
                        newNode.parent.color = Node.Color.BLACK;
                        newNode.parent.parent.color = Node.Color.RED;
                        RotateRight(newNode);
                    }
                }
            } else {
                Node uncleNode = newNode.parent.parent.left;
                if (uncleNode.color == Node.Color.RED) { // case 4: uncleNode is RED color
                    System.out.println("case 4: uncleNode is RED color");
                    newNode.parent.color = Node.Color.BLACK;
                    uncleNode.color = Node.Color.BLACK;
                    newNode.parent.parent.color = Node.Color.RED;
                    newNode = newNode.parent.parent;
                } else { // case 5, 6: uncleNode is BLACK color
                    if (newNode == newNode.parent.right) { // case 5
                        System.out.println("case 5: uncleNode is BLACK color and new node is right child");
                        newNode = newNode.parent;
                        RotateLeft(newNode);
                    } else { // case 6
                        System.out.println("case 6: uncleNode is BLACK color and new node is left child");
                        newNode.parent.color = Node.Color.BLACK;
                        newNode.parent.parent.color = Node.Color.RED;
                        RotateRight(newNode);
                    }
                }
            }
        }
        root.color = Node.Color.BLACK;
    }

    private void RotateLeft(Node newNode) {
        Node node = newNode.right;
        newNode.right = node.left;

        node.parent = newNode.parent;
        if (newNode.parent == null) {
            root = node;
        } else if (newNode == newNode.parent.left) {
            newNode.parent.left = node;
        } else {
            newNode.parent.right = node;
        }
        node.left = newNode;
        newNode.parent = node;
    }

    private void RotateRight(Node newNode) {
        Node node = newNode.left;
        newNode.left = node.right;

        node.parent = newNode.parent;
        if (newNode.parent == null) {
            root = node;
        } else if (newNode == newNode.parent.right) {
            newNode.parent.right = node;
        } else {
            newNode.parent.left = node;
        }
        node.right = newNode;
        newNode.parent = node;
    }

}
