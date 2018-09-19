package hit.the.seat.wei;

public class Node {
    // Reference to the next node in the chain,
    // or null if there isn't one
    Node next;
    // Data carried by this node
    // Could be of any type you need
    Seat element;

    // First Node constructor
    // No data, no next node
    public Node() {
        next = null;
        element = null;
    }

    // Second Node constructor
    // No pointer to the next node
    public Node(Seat data) {
        next = null;
        element = data;
    }

    // Third Node constructor
    // Pointer to the next Node
    public Node(Seat data, Node next) {
        this.next = next;
        element = data;
    }
    
    /*
    returns the element in the node
    pre: none
    post: Seat object returned
    */
    public Seat getData() {
        return element;
    }
    
    /*
    sets the element in the node
    pre: none
    post: element becomes data
    */
    public void setData(Seat data){
        element = data;
    }

    /*
    gets the next node
    pre: none
    tost: next node returned
    */
    public Node getNext(){
        return next;
    }
    
    /*
    sets the reference of the node
    pre: none
    post; sets next (original variable) to next (inputed variable)
    */
    public void setNext(Node next) {
        this.next = next;
    }
}
