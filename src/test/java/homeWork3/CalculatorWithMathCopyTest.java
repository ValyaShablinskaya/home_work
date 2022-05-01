package homeWork3;

import homeWork3.calks.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithMathCopyTest {
    CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();

    @Test
    void exponentiation() {
        double parameterOne = 5.6;
        int parameterTwo = 2;
        double expected = 31.359999999999996;
        double actual = calculatorWithMathCopy.exponentiation(parameterOne, parameterTwo);
        assertEquals(expected, actual);
    }
    @Test
    void modulus() {
        double parameter = -6.0;
        double expected = 6.0;
        double actual = calculatorWithMathCopy.modulus(parameter);
        assertEquals(expected, actual);
    }
    @Test
    void squareRoot() {
        double parameter = 25.0;
        double expected = 5.0;
        double actual = calculatorWithMathCopy.squareRoot(parameter);
        assertEquals(expected, actual);
    }
}
