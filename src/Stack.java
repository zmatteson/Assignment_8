/**
 * Created by zeb on 10/14/17.
 */

public interface Stack {
    /* String of Object initial value: <> */
    void Push (Integer x);
    /*
    precondition: true
    postcondition:
    self = <#x> * #self
    */
    Integer Pop ();
    /*
    precondition:
    self != empty_string
    postcondition:
    there exists a: String of Object,
     b: Object (Pop() == b)
    */
    Integer Top ();
    /*
    precondition:
    self != empty_string
    postcondition:
    there exists a: String of Object,
     b: Object (Top() == b)
    */
    int Length ();
/*
precondition: true
postcondition:
Length = |self|
*/

}