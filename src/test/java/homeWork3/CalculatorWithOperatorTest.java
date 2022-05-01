package homeWork3;

import homeWork3.calks.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithOperatorTest {
    CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();

    @Test
    void division() {
        double parameterOne = 28.0;
        double parameterTwo = 5.0;
        double expected = 5.6;
        double actual = calculatorWithOperator.division(parameterOne, parameterTwo);
        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        double parameterOne = 15.0;
        double parameterTwo = 7.0;
        double expected = 105.0;
        double actual = calculatorWithOperator.multiply(parameterOne, parameterTwo);
        assertEquals(expected, actual);
    }

    @Test
    void subtraction() {
        double parameterOne = 15.0;
        double parameterTwo = 7.0;
        double expected = 8.0;
        double actual = calculatorWithOperator.subtraction(parameterOne, parameterTwo);
        assertEquals(expected, actual);
    }
    @Test
    void addition() {
        double parameterOne = 4.1;
        double parameterTwo = 105.0;
        double expected = 109.1;
        double actual = calculatorWithOperator.addition(parameterOne, parameterTwo);
        assertEquals(expected, actual);
    }
    @Test
    void exponentiation() {
        double parameterOne = 5.6;
        int parameterTwo = 2;
        double expected = 31.359999999999996;
        double actual = calculatorWithOperator.exponentiation(parameterOne, parameterTwo);
        assertEquals(expected, actual);
    }
    @Test
    void modulus() {
        double parameter = -6.0;
        double expected = 6.0;
        double actual = calculatorWithOperator.modulus(parameter);
        assertEquals(expected, actual);
    }
    @Test
    void squareRoot() {
        double parameter = 25.0;
        double expected = 5.0;
        double actual = calculatorWithOperator.squareRoot(parameter);
        assertEquals(expected, actual);
    }
}