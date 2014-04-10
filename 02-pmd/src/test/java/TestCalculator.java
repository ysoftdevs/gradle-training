
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        calc.add(1);
        Assert.assertEquals(calc.getCounter(), 1);
    }
}
