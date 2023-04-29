import org.junit.jupiter.api.*;

import javax.management.ConstructorParameters;

public class CalculatorTests {
    Calculator calculator;

    @BeforeEach
    public void beforeEachTest(){
        calculator = new Calculator();
    }

    @AfterEach
    public void afterEach(){
        calculator = null;
    }

    @org.junit.jupiter.api.Test
    public void testPlus_validPlus_success(){
        int a = 2;
        int b = 3;
        int expected = 5;
        int result = calculator.plus(a, b);
        Assertions.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testMinus_validMinus_success(){
        int a = 5;
        int b = 2;
        int expected = 3;
        int result = calculator.minus(a, b);
        Assertions.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testDevide_validDevide_success(){
        int a = 10;
        int b = 2;
        int expected = 5;
        int result = calculator.devide(a, b);
        Assertions.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testMultiply_validMultiply_success(){
        int a = 5;
        int b = 5;
        int expected = 25;
        int result = calculator.multiply(a, b);
        Assertions.assertEquals(expected, result);
    }
}
