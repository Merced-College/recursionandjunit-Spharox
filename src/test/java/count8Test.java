import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class count8Test {

    @Test
    public void testRunNone() {
        assertEquals(0, recursionMethods.count8(3941));
    }
    
    public void testRunOne() {
        assertEquals(1, recursionMethods.count8(8));
    }
    
    public void testRunTwo() {
        assertEquals(1, recursionMethods.count8(818));
    }
    
    public void testRunFour() {
        assertEquals(1, recursionMethods.count8(8818));
    }
}