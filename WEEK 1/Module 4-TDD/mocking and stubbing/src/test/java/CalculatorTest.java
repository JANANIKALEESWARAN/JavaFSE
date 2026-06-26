import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		 Calculator calc = new Calculator();
	        int result = calc.add(5, 10);
	        assertEquals(15, result);
	}

}
