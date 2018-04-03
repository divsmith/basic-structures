import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by parker on 3/25/18.
 */
class ArrayStackTest {

    @Test
    void is_empty()
    {
        ArrayStack<String> ss = new ArrayStack<>();
        Assertions.assertTrue(ss.isEmpty());
    }

    @Test
    void push_pop()
    {
        ArrayStack<String> ss = new ArrayStack<>();
        ss.push("Testing");
        Assertions.assertEquals("Testing", ss.pop());
    }

    @Test
    void fifo()
    {
        ArrayStack<String> ss = new ArrayStack<>();
        ss.push("first");
        ss.push("second");
        Assertions.assertEquals("second", ss.pop());
        Assertions.assertEquals("first", ss.pop());
    }

    @Test
    void not_empty()
    {
        ArrayStack<String> ss = new ArrayStack<>();
        ss.push("test");
        Assertions.assertFalse(ss.isEmpty());
    }

    @Test
    void empty_after_push_pop()
    {
        ArrayStack<String> ss = new ArrayStack<>();
        ss.push("test");
        ss.pop();
        Assertions.assertTrue(ss.isEmpty());
    }

    @Test
    void test_resizing_larger_and_smaller()
    {
        ArrayStack<String> as = new ArrayStack<>();
        as.push("one");
        as.push("two");
        as.push("three");
        as.push("four");
        as.push("five");
        as.push("six");
        as.push("seven");
        as.push("eight");

        as.pop();
        as.pop();
        as.pop();
        as.pop();
        as.pop();
        as.pop();

        as.push("test1");

        Assertions.assertEquals("test1", as.pop());
        Assertions.assertEquals("two", as.pop());
    }
}