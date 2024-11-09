import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class strCountTest {

    @Test
    public void testRunOne() {
        assertEquals(2, recursionMethods.strCount("catcowcat", "cat"));
    }
    
    public void testRunTwo() {
        assertEquals(1, recursionMethods.strCount("catcowcat", "cow"));
    }
    
    public void testRunThree() {
        assertEquals(0, recursionMethods.strCount("catcowcat", "dog"));
    }
}