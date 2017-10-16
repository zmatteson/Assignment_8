import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Created by zeb on 10/14/17.
 */
public class StackDecorator1Test {
    private StackImpl1 stackImplementation;
    private StackDecorator1 stack;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        stackImplementation = new StackImpl1();
        stack = new StackDecorator1(stackImplementation);
        stack.Push(1);
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    @DisplayName("The stack decorator should print Push when pushing to the stack")
    public void printPush() {
        stack.Push(2);
        assertEquals("Push\n", outContent.toString());
    }
    @Test
    @DisplayName("The stack decorator should print Pop when Pop() is called")
    public void printPop() {
        stack.Pop();
        assertEquals("Pop\n", outContent.toString());
    }
    @Test
    @DisplayName("The stack decorator should print Top when Top() is called")
    public void printTop() {
        stack.Top();
        assertEquals("Top\n", outContent.toString());
    }
    @Test
    @DisplayName("The stack decorator should print Length when Length() is called")
    public void printLength() {
        stack.Length();
        assertEquals("Length\n", outContent.toString());
    }


}
