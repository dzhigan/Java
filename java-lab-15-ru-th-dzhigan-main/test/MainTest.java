import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testSum() {
        assertEquals(5, Main.sum(2, 3));
    }

    @Test
    void testNegative() {
        assertEquals(-1, Main.sum(2, -3));
    }
}