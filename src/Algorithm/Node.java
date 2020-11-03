package Algorithm;

public class Node {
    int data;
    Node left;
    Node right;
    Node parent;
    Color color;

    enum Color {
        No,
        RED,
        BLACK
    }

    public Node(int element) {
        data = element;
        left = null;
        right = null;
        parent = null;
    }

    public Node(int element, Color newColor, Node node) {
        data = element;
        left = null;
        right = null;
        parent = node;
        color = newColor;
    }
}
