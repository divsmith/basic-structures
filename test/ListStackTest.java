import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by parker on 3/25/18.
 */
class ListStackTest {

    @Test
    void is_empty()
    {
        ListStack<String> ss = new ListStack<>();
        Assertions.assertTrue(ss.isEmpty());
    }

    @Test
    void push_pop()
    {
        ListStack<String> ss = new ListStack<>();
        ss.push("Testing");
        Assertions.assertEquals("Testing", ss.pop());
    }

    @Test
    void fifo()
    {
        ListStack<String> ss = new ListStack<>();
        ss.push("first");
        ss.push("second");
        Assertions.assertEquals("second", ss.pop());
        Assertions.assertEquals("first", ss.pop());
    }

    @Test
    void not_empty()
    {
        ListStack<String> ss = new ListStack<>();
        ss.push("test");
        Assertions.assertFalse(ss.isEmpty());
    }

    @Test
    void empty_after_push_pop()
    {
        ListStack<String> ss = new ListStack<>();
        ss.push("test");
        ss.pop();
        Assertions.assertTrue(ss.isEmpty());
    }
}