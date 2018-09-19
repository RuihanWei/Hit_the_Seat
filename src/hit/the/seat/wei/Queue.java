
package hit.the.seat.wei;
/**
 *
 * @author apple1
 */
public interface Queue {   
    //  Adds one element to the rear of the queue
   public void enqueue (Seat element);
   //  Removes and returns the element at the front of the queue
   public Seat dequeue( );
   //  Returns without removing the element at the front of the queue
   public Seat first( );   
   //  Returns true if the queue contains no elements
   public boolean isEmpty( );
   //  Returns the number of elements in the queue
   public int size( );
}
