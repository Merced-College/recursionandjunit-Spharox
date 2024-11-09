import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class stringCleanTest {

    @Test
    public void testRunOne() {
        assertEquals("yza", recursionMethods.stringClean("yyzzza"));
    }
    
    public void testRunTwo() {
        assertEquals("abcd", recursionMethods.stringClean("abbbcdd"));
    }
    
    public void testRunThree() {
        assertEquals("Helo", recursionMethods.stringClean("Hello"));
    }
}