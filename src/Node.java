public class Node {
    public Integer value;
    public Node left = null;
    public Node right = null;
    public void setValue(Integer value) {
        this.value = value;
    }
    public Integer getValue() {
        return value;
    }
    public Node() {}
    public Node(Integer value) {
        this.value = value;
    }
}
