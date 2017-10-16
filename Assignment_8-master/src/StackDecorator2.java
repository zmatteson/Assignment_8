/**
 * Created by Evan on 10/14/17.
 */
public class StackDecorator2 extends StackDecorator {

    public StackDecorator2(Stack decoratedStack) {
        super(decoratedStack);
    }
    
    @Override
    public void Push(Integer x) {
        decoratedStack.Push(x);
        System.out.println("TRUE"); // no prereq
    }
    
    @Override
    public Integer Pop() {
        if (decoratedStack.Length() < 1) {
            System.out.println("FALSE"); 
        }
        else {
            System.out.println("TRUE");
        }
        return decoratedStack.Pop();

    }

    @Override
    public Integer Top() {
        if (decoratedStack.Length() < 1) {
            System.out.println("FALSE");
        }
        else {
            System.out.println("TRUE");
        }
        return decoratedStack.Top();
    }
    
    @Override
    public int Length() {
        System.out.println("Length"); //no prereq
        return decoratedStack.Length();
    }
}

