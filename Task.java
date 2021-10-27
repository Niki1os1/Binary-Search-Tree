
import java.util.*;

class Task {
    static void task(BinarySearchTree tree) {
        List<Node> deepest = new ArrayList<>(); //����� �������� ������
        getAllDeepestNodes(tree, tree.getRoot(), deepest); //�������� ��� ����� �������� �������
        List<Node> res = new ArrayList<>();
        getParent(deepest, res); //res - �������� ���� �� ����� � �����
        res.addAll(deepest); //������� ����� �������� ������
        int q = func(tree);
        Comparator<Node> comparator = Comparator.comparing(Node::getData);
        res.sort(comparator); //���������� �� ��������

        System.out.println();
        if (res.size() != 0) {
            System.out.print("��� ������� ����: ");
            for (Node i : res) {
                System.out.print(i.getData() + " ");
            }
            System.out.println();
            tree.deleteRight(res.get(0).getData());
            tree.deleteRight(res.get(q).getData());
        } else System.out.println("������ �������");
        System.out.println("������ �����:");
        tree.preorder();
        System.out.println();
        System.out.println("�������� �����: ");
        tree.inorder();
        System.out.println("������������ �����: ");
        tree.postorder();
    }

    private static void getParent(List<Node> deepestNodes, List<Node> result) {
        List<Node> parent = new ArrayList<>();
        for (Node deepestNode : deepestNodes) {
            if (deepestNode.getParent() != null) {
                parent.add(deepestNode.getParent());
                result.add(deepestNode.getParent());
            }
        }
        if (parent.size() > 0) {
            getParent(parent, result);
        }
    }



    private static void getAllDeepestNodes(BinarySearchTree bst, Node node, List<Node> deepestNodes) {
        final int height = bst.getHeight(bst.getRoot());
        if (node == null) return;
        if (bst.getDepth(node) == height) deepestNodes.add(node);
        else {
            getAllDeepestNodes(bst, node.getRight(), deepestNodes);
            getAllDeepestNodes(bst, node.getLeft(), deepestNodes);
        }
    }

    private static int func(BinarySearchTree bst) {
        final int height = bst.getHeight(bst.getRoot());
        return height;
    }
}