import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {
    @BeforeMethod
    public void setUp() throws Exception {
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(new Calculator().add(2, 2), 4);
    }

    @Test
    public void testSub() throws Exception {
        Assert.assertEquals(new Calculator().sub(2, 2), 0);
    }

    @Test
    public void testMul() throws Exception {
        Assert.assertEquals(new Calculator().mul(2, 2), 4);
    }
}
