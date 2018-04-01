import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by parker on 3/31/18.
 */
public class LinkedListStringQueueTest {
    private LinkedListStringQueue sq;

    @BeforeEach
    void initEach()
    {
        sq = new LinkedListStringQueue();
    }

    @Test
    void is_empty()
    {
        Assertions.assertTrue(sq.isEmpty());
    }

    @Test
    void not_empty()
    {
        sq.enqueue("test");
        Assertions.assertFalse(sq.isEmpty());
    }

    @Test
    void enqueue_dequeue()
    {
        sq.enqueue("test");
        sq.enqueue("test2");
        sq.enqueue("test3");
        sq.enqueue("test4");
        Assertions.assertEquals("test", sq.dequeue());
        Assertions.assertEquals("test2", sq.dequeue());
        Assertions.assertEquals("test3", sq.dequeue());
        Assertions.assertEquals("test4", sq.dequeue());
    }

}
