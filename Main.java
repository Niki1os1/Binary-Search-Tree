

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.addNode(100);
        bst.addNode(50);
        bst.addNode(200);
        bst.addNode(25);
        bst.addNode(75);
        bst.addNode(150);
        bst.addNode(250);
        bst.addNode(15);
        bst.addNode(35);
        bst.addNode(65);
        bst.addNode(85);
        bst.addNode(125);
        bst.addNode(175);
        bst.addNode(225);
        bst.addNode(275);
        bst.addNode(226);
        bst.addNode(86);
        bst.addNode(84);
        bst.addNode(14);
        bst.addNode(13);

        bst.printTree();

        Task.task(bst);

        bst.printTree();
    }


}
