import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class countHi2Test {

    @Test
    public void testRunOne() {
        assertEquals(1, recursionMethods.countHi2("ahixhi"));
    }
    
    public void testRunTwo() {
        assertEquals(2, recursionMethods.countHi2("ahibhi"));
    }
    
    public void testRunThree() {
        assertEquals(0, recursionMethods.countHi2("xhixhi"));
    }
}