import org.example.FactorialCalculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.Assert.assertEquals;

public class TestFactorial {
    @DataProvider(name = "factorialData")
    public Object[][] factorialData() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {5, 120}
        };
    }

    @Test(dataProvider = "factorialData")
    public void testFactorial(int input, long expected) {
        assertEquals(FactorialCalculator.calculateFactorial(input), expected);
    }

    @DataProvider(name = "factorialNegativeData")
    public Object[][] factorialNegativeData() {
        return new Object[][]{
                {-4},
                {-8},
                {-90}
        };
    }

    @Test(dataProvider = "factorialNegativeData")
    public void testFactorialNegativeNumber(int input) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.calculateFactorial(input);
        });
        assertEquals(exception.getMessage(), "число не должно быть отрицательным");

    }


}








