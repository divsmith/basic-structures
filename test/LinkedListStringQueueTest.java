import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by parker on 3/31/18.
 */
public class LinkedListStringQueueTest {
    @Test
    void is_empty()
    {
        LinkedListStringQueue sq = new LinkedListStringQueue();
        Assertions.assertTrue(sq.isEmpty());
    }
}
