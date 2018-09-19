
package hit.the.seat.wei;

/**
 *
 * @author apple1
 */
public class LinkedQueue implements Queue {

    int count = 0;// variables
    public Node front = null;
    public Node rear = null;

    // constructor 
    public LinkedQueue() {
    }

    /*  
    Adds one element to the rear of the queue
    pre: none
    post: a Seat element added to the queue
     */
    public void enqueue(Seat element) {
        Node a = new Node(element);
        if (!(isEmpty())) {       // when the number of items in the Queue is not equal to 0
            rear.setNext(a);      // set the current rear Seat's reference to "a"
        } else {                  // when the number of items is equal to 0
            front = a;            // set the front to a
        }
        rear = a;                 // set rear to "a" under all circumstances
        count++;
    }

    /*  
    Removes and returns the element at the front of the queue
    pre: none
    post: returns Seat object, front Seat removed
    */
    public Seat dequeue() {
        Seat a = front.getData();             //store the dequeued Seat               
        if (isEmpty()) {            // do nothing when the queue is empty, since the main program controls the use of dequeue, no exception need to be thrown
        } else if (count != 1) {        // when count is not 1 or 0
            front = front.getNext();
            count--;
        } else {                    // when there is only 1 element, Theoretically, this piece of code is not required since if front.getNext() is null, null is returned, however, an exception has to be caught in this case so writing an else is of the same efficiency
            front = null;
            rear = null;
            count--;
        }
        return a;
    }

    /*
    Returns without removing the element at the front of the queue
    pre; none
    post: Seat returned
    */
    public Seat first() {
        if (!isEmpty()) {
            return front.getData();
        }
        return null;        // return null if the queue is empty
    }

    /*
    Returns the number of elements in the queue
    Pre: none
    post: count variable returned
    */
    public int size() {
        return count;
    }

    /* 
    Returns true if the queue contains no elements
    pre: none
    post: boolean retunred
    */
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }
}
