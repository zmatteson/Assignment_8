/**
 * Created by zeb on 10/14/17.
 */
public abstract class StackDecorator implements Stack {

    protected Stack decoratedStack;
    public StackDecorator(Stack decoratedStack) {
        this.decoratedStack = decoratedStack;
    }
    public void Push(Integer x) {
        decoratedStack.Push(x);
    }
    public Integer Pop() {
        return decoratedStack.Pop();
    }

    public Integer Top() {
        return decoratedStack.Top();
    }
    public int Length() {
        return decoratedStack.Length();
    }
}
