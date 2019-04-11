import org.junit.Test;
import recursion.Factorial;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorialTest() {
        assertEquals(362880,Factorial.Factorial(9));
    }
}