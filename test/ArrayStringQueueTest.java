import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by parker on 4/1/18.
 */
public class ArrayStringQueueTest {
    private ArrayStringQueue sq;

    @BeforeEach
    void initEach()
    {
        sq = new ArrayStringQueue();
    }

    @Test
    void is_empty()
    {
        Assertions.assertTrue(sq.isEmpty());
    }

}
