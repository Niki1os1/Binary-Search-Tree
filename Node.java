
public class Node {
    private Integer data; //value
    private Node left;   //left descendant
    private Node right;  //right descendant
    private Node parent; //parent

    Node(Integer data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public Integer getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node getParent() {
        return parent;
    }

    public void setLeft(Integer data) {
        this.left = new Node(data);
    }

    public void setRight(Integer data) {
        this.right = new Node(data);
    }

    public void setLeft(Node node) {
        left = node;
    }

    public void setRight(Node node) {
        right = node;
    }

    public void setParent(Integer data) {
        this.parent = new Node(data);
    }

    public void setParent(Node node) {
        parent = node;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void print() {
        print("", this, false);
    }

    public void print(String prefix, Node n, boolean isLeft) {
        System.out.println(prefix + (isLeft ? (char)27 + "[34m" + "|-- " + (char)27 + "[30m" : (char)27 + "[34m"
                + "|__ " + (char)27 + "[30m") + ((n != null) ? (isLeft ? (char)27 + "[35m" + "L:" + (char)27 + "[30m" + n.data + (char)27 + "[37m" : (char)27 + "[32m"
                + ((n.parent == null) ? "" : "R:") + (char)27 + "[30m" + n.data + (char)27 + "[37m")
                : ((isLeft ? (char)27 + "[35m" + "L:" + (char)27 + "[31m" + "-" + (char)27 + "[37m" : (char)27 + "[32m" + "R:" + (char)27 + "[32m" + "-" + (char)27 + "[37m"))));
        if (n != null) {
            if (n.getLeft() != null || n.getRight() != null) {
                print(prefix + (isLeft ? (char)27 + "[34m" + "|   " : "    ") + (char)27 + "[30m", n.left, true);
                print(prefix + (isLeft ? (char)27 + "[34m" + "|   " : "    ") + (char)27 + "[30m", n.right, false);
            }
        }

    }
}
