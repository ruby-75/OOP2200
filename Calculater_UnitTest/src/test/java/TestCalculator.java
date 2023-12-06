

import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    Calculator c = new Calculator();

    @Test
    void performAddition() {
        c.setNum1(2.2);
        c.setNum2(3.0);
        c.setOperator("➕"); // Set the operator for addition
        assertEquals(5.2, c.performCalculations());

        c.setNum1(-52.3);
        c.setNum2(25.2);
        c.setOperator("➕"); // Set the operator for addition
        assertEquals(-27.1, c.performCalculations());

        c.setNum1(-3.0);
        c.setNum2(-5.2);
        c.setOperator("➕"); // Set the operator for addition
        assertEquals(-8.2, c.performCalculations());
    }

    @Test
    void performSubtraction() {
        c.setNum1(7.);
        c.setNum2(3.);
        c.setOperator("➖"); // Set the operator for addition
        assertEquals(4, c.performCalculations());

        c.setNum1(2.2);
        c.setNum2(3.);
        c.setOperator("➖"); // Set the operator for addition
        assertEquals(-0.8, c.performCalculations());

        c.setNum1(100.0);
        c.setNum2(72.5);
        c.setOperator("➖"); // Set the operator for addition
        assertEquals(27.5, c.performCalculations());

    }

    @Test
    void performMultiplication() {
        c.setNum1(4.2);
        c.setNum2(3.0);
        c.setOperator("✖"); // Set the operator for multiplication
        assertEquals(12.60, c.performCalculations());

        c.setNum1(-4.2);
        c.setNum2(3.0);
        c.setOperator("✖"); // Set the operator for multiplication
        assertEquals(-12.60, c.performCalculations());

        c.setNum1(-4.2);
        c.setNum2(-3.0);
        c.setOperator("✖"); // Set the operator for multiplication
        assertEquals(12.60, c.performCalculations());

    }
    @Test
    void performDivision() {
        c.setNum1(12.0);
        c.setNum2(3.0);
        c.setOperator("➗"); // Set the operator for Division
        assertEquals(4, c.performCalculations());

        c.setNum1(-12.0);
        c.setNum2(3.0);
        c.setOperator("➗"); // Set the operator for Division
        assertEquals(-4, c.performCalculations());

        c.setNum1(0.0);
        c.setNum2(3.0);
        c.setOperator("➗"); // Set the operator for Division
        assertEquals(0, c.performCalculations());

        c.setNum1(3.0);
        c.setNum2(0.0);
        c.setOperator("➗"); // Set the operator for Division
        assertEquals(0, c.performCalculations());

    }



}
