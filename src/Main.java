public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insertNode(6);
        tree.insertNode(8);
        tree.insertNode(5);
        tree.insertNode(8);
        tree.insertNode(2);
        tree.insertNode(9);
        tree.insertNode(7);
        tree.insertNode(4);
        tree.insertNode(10);
        tree.insertNode(3);
        tree.insertNode(1);
        for (int i = 0; i < 10; i++) {
            System.out.println(tree.countOnLevel(i) + " " + i);
        }
    }
}