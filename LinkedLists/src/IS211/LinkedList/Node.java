package IS211.LinkedList;

public class Node<E> {
    Node nextNode;
    Node formerNode;
    E data;

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    public Node getFormerNode() {
        return formerNode;
    }

    public void setFormerNode(Node<E> formerNode) {
        this.formerNode = formerNode;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
