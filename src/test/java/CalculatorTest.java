import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(50, calculator.add(30, 20));
    }

    @Test
    public void canSubtract(){
        assertEquals(10, calculator.subtract(20, 10));
    }

    @Test
    public void canMultiply(){
        assertEquals(100, calculator.multiply(10, 10));
    }

    @Test
    public void canDivide(){
        assertEquals(1.25, calculator.divide(12.5, 10),0.00);
    }



}
