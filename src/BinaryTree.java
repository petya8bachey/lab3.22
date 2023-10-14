import java.lang.reflect.Array;

public class BinaryTree {
    public Node rootNode = null;


    public void insertNode(Integer value) {
        Node newNode = new Node(value);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            Node currentNode = rootNode;
            Node parentNode;
            while (true)
            {
                parentNode = currentNode;
                if (value.equals(currentNode.getValue())) {
                    return;
                } else if (value < currentNode.getValue()) {
                    currentNode = currentNode.left;
                    if (currentNode == null) {
                        parentNode.left = newNode;
                        return;
                    }
                } else {
                    currentNode = currentNode.right;
                    if (currentNode == null) {
                        parentNode.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    Integer countOnLevel(int N)
    {
        if (rootNode == null)
            return 0;
        if (N == 0)
            return 1;
        return countOnLevel(N - 1, rootNode.left) + countOnLevel(N - 1, rootNode.right);
    }
    Integer countOnLevel(int N, Node node)
    {
        if (node == null)
            return 0;
        if (N == 0)
            return 1;
        return countOnLevel(N - 1, node.left) + countOnLevel(N - 1, node.right);
    }
}
