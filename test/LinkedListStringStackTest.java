import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by parker on 3/25/18.
 */
class LinkedListStringStackTest {

    @Test
    void is_empty()
    {
        LinkedListStringStack ss = new LinkedListStringStack();
        Assertions.assertTrue(ss.isEmpty());
    }

    @Test
    void push_pop()
    {
        LinkedListStringStack ss = new LinkedListStringStack();
        ss.push("Testing");
        Assertions.assertEquals("Testing", ss.pop());
    }

    @Test
    void fifo()
    {
        LinkedListStringStack ss = new LinkedListStringStack();
        ss.push("first");
        ss.push("second");
        Assertions.assertEquals("second", ss.pop());
        Assertions.assertEquals("first", ss.pop());
    }

    @Test
    void not_empty()
    {
        LinkedListStringStack ss = new LinkedListStringStack();
        ss.push("test");
        Assertions.assertFalse(ss.isEmpty());
    }

    @Test
    void empty_after_push_pop()
    {
        LinkedListStringStack ss = new LinkedListStringStack();
        ss.push("test");
        ss.pop();
        Assertions.assertTrue(ss.isEmpty());
    }
}