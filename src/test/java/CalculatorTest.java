import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        // The student passes if 2 + 3 equals 5
        assertEquals(5, calc.add(2, 3), "Logic Error: 2 + 3 should equal 5");
    }

    @Test
    public void testNegativeNumbers() {
        Calculator calc = new Calculator();
        assertEquals(-5, calc.add(-2, -3), "Logic Error: -2 + -3 should equal -5");
    }
}
