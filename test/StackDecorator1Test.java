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

    @AfterEach
    public void teatDown() {
        System.setOut(null);
    }

    @Test
    @DisplayName("The stack decorator should print Push when pushing to the stack")
    public void printPush() {
        stack.Push(2);
        assertEquals("Push\n", outContent.toString());
    }
}
