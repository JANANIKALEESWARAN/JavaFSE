import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAATest {

    private Calculator calculator;

    
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator object created");
    }

   
    @Test
    public void testAddition() {

    
        int a = 10;
        int b = 20;

        
        int result = calculator.add(a, b);

        assertEquals(30, result);
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator object destroyed");
    }
}