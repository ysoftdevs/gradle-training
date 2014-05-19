import com.ysoft.training.Calculator

import org.testng.annotations.Test
import org.testng.Assert

class CalculatorTest {
    @Test
    void stitchInTimeSavesNine() {
        def calculator = new Calculator()
        Assert.assertEquals(calculator.add(4,5), 9)
    }
}

