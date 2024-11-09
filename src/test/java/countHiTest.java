import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class countHiTest {

    @Test
    public void testRunOne() {
        assertEquals(1, recursionMethods.countHi("xxhixx"));
    }
    
    public void testRunTwo() {
        assertEquals(2, recursionMethods.countHi("xhixhix"));
    }
    
    public void testRunThree() {
        assertEquals(1, recursionMethods.countHi("hi"));
    }
}