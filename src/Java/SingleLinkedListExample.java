public class SingleLinkedListExample {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
    }
}



class Node{
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
    public Node(Node next ) {
        this.next = next;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
