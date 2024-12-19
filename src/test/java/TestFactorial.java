import org.example.CalculateFactorial;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.example.CalculateFactorial.calculateFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFactorial {
    @ParameterizedTest(name = "факториал{0} равен {1}")
    @CsvSource({
            "0,1",
            "1,1",
            "2,2",
            "3,6",
            "4,24",
            "5,120",
            "10,3628800"
    })

    public void testFactorial(int input, long expected) {
        assertEquals(expected, calculateFactorial(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {-2,-3,-4,-12})
    public void testFactorialNegativeNumber(int input) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculateFactorial.calculateFactorial(input);
        });
        assertEquals("число не должно быть отрицательным", exception.getMessage());
    }
}







