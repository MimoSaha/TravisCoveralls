package dekz.traviscoveralls;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class CalculatorTest {

    @Test
    public void addTest() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.add(3.0,2.5);
        assertEquals(5.5,result,0);
    }
}
