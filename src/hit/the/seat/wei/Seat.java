// Seat class

package hit.the.seat.wei;

/**
 *
 * @author apple1
 */
public class Seat {
    private boolean  IsStudent;
    private boolean  IsBook;
    private boolean  IsEmpty;
    private String Type;
    
    
    // Constructor 
    Seat(String a){
        if (a.equals("LongHand")){  // long hand student 
            IsStudent = true;
            IsBook = false;
            IsEmpty = false;
            Type = "LongHand";
        } else if (a.equals("Large")) {  // large student 
            IsStudent = true;
            IsBook = false;
            IsEmpty = false;
            Type = "Large";            
        } else if (a.equals("Empty")){  // empty seat
            IsStudent = false;
            IsBook = false;
            IsEmpty = true;
            Type = "Empty";
        } else {                         //seat with books
            IsStudent = false;
            IsBook = true;
            IsEmpty = false;
            Type = "Books";
        }
    }
    
    
    /*
    returns whether the seat is a student or not
    pre: none
    post: boolean returned
    */
    public boolean isStudent(){
        return IsStudent;
    }
    
    /*
    returns whether the seat is a book or not
    pre: none
    post: boolean returned
    */
    public boolean isBook(){
        return IsBook;
    }
    
    /*
    returns whether the seat is empty or not
    pre: none
    post: boolean returned
    */
    public boolean isEmpty(){
        return IsEmpty;
    }
    
    /*
    returns the type of objec
    pre: none
    post: boolean returned
    */
    public String getType(){
        return Type;
    }
    
}