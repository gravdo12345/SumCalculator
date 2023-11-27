import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumOfOneShouldReturnOne() {
        assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    void sumOfThreeShouldReturnSix() {
        assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    void sumOfZeroShouldReturnInvalidValue() {
        assertEquals(Integer.MIN_VALUE, sumCalculator.sum(0));
    }

    @Test
    void sumOfNegativeNumberShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(-1));
    }
}
