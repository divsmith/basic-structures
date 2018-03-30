import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by parker on 3/25/18.
 */
class ArrayStringStackTest {

    @Test
    void is_empty()
    {
        ArrayStringStack ss = new ArrayStringStack();
        Assertions.assertTrue(ss.isEmpty());
    }

//    @Test
//    void push_pop()
//    {
//        ArrayStringStack ss = new ArrayStringStack();
//        ss.push("Testing");
//        Assertions.assertEquals("Testing", ss.pop());
//    }
//
//    @Test
//    void fifo()
//    {
//        ArrayStringStack ss = new ArrayStringStack();
//        ss.push("first");
//        ss.push("second");
//        Assertions.assertEquals("second", ss.pop());
//        Assertions.assertEquals("first", ss.pop());
//    }
//
//    @Test
//    void not_empty()
//    {
//        ArrayStringStack ss = new ArrayStringStack();
//        ss.push("test");
//        Assertions.assertFalse(ss.isEmpty());
//    }
//
//    @Test
//    void empty_after_push_pop()
//    {
//        ArrayStringStack ss = new ArrayStringStack();
//        ss.push("test");
//        ss.pop();
//        Assertions.assertTrue(ss.isEmpty());
//    }
}