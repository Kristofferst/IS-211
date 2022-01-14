package IS211.LinkedList;

public class LinkedList<E> {
    protected Node<E> headLocation;
    int length;
    int index = -1;

    public void add(E element) {
        Node<E> newNode = new Node<>();
        newNode.setData(element);
        if (length == 0){
            newNode.setNextNode(newNode);
        }

        if (length > 0) {
            Node<E> tmpNext = headLocation.getNextNode();
            headLocation.setNextNode(newNode);
            newNode.setFormerNode(headLocation);
            newNode.setNextNode(tmpNext);
            tmpNext.setFormerNode(newNode);
        }
        headLocation = newNode;
        length++;
        index++;
    }

    public void remove(E element) {
        if(contains(element)){
        Node<E> tmpNext = headLocation.getNextNode();
        goBackward();
        headLocation.setNextNode(tmpNext);
        tmpNext.setFormerNode(headLocation);
        length--;
        index--;
        }
    }

    public boolean contains(E element) {
        boolean looking = true;
        int lookedAt = 0;
        while (looking){
            if (lookedAt == length){
                looking = false;
            }
            Node<E> current = headLocation;
            if (current.getData().equals(element)){
                return true;
            }
            else {
                lookedAt++;
                goForward();
            }
        }
        return false;
    }

    private void goForward(){
        headLocation = headLocation.getNextNode();
        if (index < length -1){
            index++;
        }
        else {
            index = 0;
        }
    }

    private void goBackward(){
        headLocation = headLocation.getFormerNode();
        if (index > 0){
            index--;
        }
        else {
            index = length-1;
        }
    }
}
