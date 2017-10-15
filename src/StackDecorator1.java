/**
 * Created by zeb on 10/14/17.
 */
public class StackDecorator1 extends StackDecorator {
    public StackDecorator1(Stack decoratedStack) {
        super(decoratedStack);
    }
    public void Push(Integer x) {
        decoratedStack.Push(x);
        System.out.println("Push");
    }
    public Integer Pop() {
        System.out.println("Pop");
        return decoratedStack.Pop();

    }

    public Integer Top() {
        System.out.println("Top");
        return decoratedStack.Top();
    }
    public int Length() {
        System.out.println("Length");
        return decoratedStack.Length();
    }
}
