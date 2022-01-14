package IS211.LinkedList;

public class LinkedList {
    protected Node headLocation;
    int length;
    int index = -1;

    public <E> void add(Object element) {
        Node<E> newNode = new Node<>();
        newNode.setData((E) element);
        if (length == 0){
            newNode.setNextNode(newNode);
        }

        if (length > 0) {
            Node tmpNext = headLocation.getNextNode();
            headLocation.setNextNode(newNode);
            newNode.setFormerNode(headLocation);
            newNode.setNextNode(tmpNext);
            tmpNext.setFormerNode(newNode);
        }
        headLocation = newNode;
        length++;
        index++;
    }

    public void remove(Object element) {
        if(contains(element)){
        Node tmpNext = headLocation.getNextNode();
        goBackward();
        headLocation.setNextNode(tmpNext);
        tmpNext.setFormerNode(headLocation);
        length--;
        index--;
        }
    }

    public boolean contains(Object element) {
        boolean looking = true;
        int lookedAt = 0;
        while (looking){
            if (lookedAt == length){
                looking = false;
            }
            Node current = headLocation;
            System.out.println(headLocation.getData());
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
