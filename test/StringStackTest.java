import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 3/25/18.
 */
class StringStackTest {

    @Test
    void is_empty()
    {
        StringStack ss = new StringStack();
        Assertions.assertTrue(ss.isEmpty());
    }
}