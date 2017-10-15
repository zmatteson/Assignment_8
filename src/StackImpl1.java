import java.util.ArrayList;

/**
 * Created by zeb on 10/14/17.
 */
public class StackImpl1 implements Stack {
    ArrayList<Integer> array;

    StackImpl1() {
        array = new ArrayList<>();
    }

    public void Push(Integer x) {
        array.add(x);
    }

    public Integer Pop() {
        int top = array.get(array.size() - 1);
        array.remove(array.size()-1);
        return top;
    }

    public Integer Top() {
        return array.get(array.size()-1);
    }

    public int Length() {
        return array.size() - 1;
    }
}
