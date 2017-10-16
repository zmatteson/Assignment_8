import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by Evan on 10/16/17.
 */
public class StackDecorator2Test {
    private StackImpl1 stackImplementation;
    private StackDecorator2 stack;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        stackImplementation = new StackImpl1();
        stack = new StackDecorator2(stackImplementation);
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    @DisplayName("The stack decorator should print FAlSE when top is called on an empty stack")
    public void popFalse() {
        stack.Pop();
        assertEquals("FALSE\n", outContent.toString());
    }

    @Test
    @DisplayName("The stack decorator should print FAlSE when top is called on an empty stack")
    public void topFalse() {
        stack.Top();
        assertEquals("FALSE\n", outContent.toString());
    }

    
   

}
