package tddexampleMath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {
    
    @Test
    void test01(){
        fail("Not yet implemented"); // The assertion "fail" ensures that it fails because it hasn't been implemented yet.
    }

    @Test
    void test02(){
        //Let's instantiate (call) the class (in this case SimpleMath) to create a new object of this class, perform an operation, and verify if it's really what we expected.
        SimpleMath math = new SimpleMath(); // Define an instance (An instance is an occurrence or example of something, often referring to a specific object created from a class in object-oriented programming.)
        Double actual = math.sum(6.2D, 2D);
        double expected = 8.2D;
        Assertions.assertEquals(expected , actual); 
    }

    @Test
    void test03(){
        SimpleMath math = new SimpleMath();
        Double actual = math.subtraction(6.2D, 2D);
        double expected = 5.2D;
        Assertions.assertEquals(expected, actual, "6.2 - 2 did not produce 5.2!"); // The message is shown because there is an error in the test.
        Assertions.assertNotEquals(3.2, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    void test04(){
        SimpleMath math = new SimpleMath();
        Double actual = math.subtraction(6.2D, 2D);
        double expected = 4.2D;
        Assertions.assertEquals(expected, actual, "6.2 - 2 produce 4.2!"); // Don't show the message because the test is ok.
    }

    @Test
    void testSum(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.5D;
        double secondNumber = 2.3D;

        Double actual = math.sum(firstNumber,secondNumber);

        Double expected = 8.8D;

        assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + "did not produce" + expected);
        assertNotNull(actual);
    }
}

