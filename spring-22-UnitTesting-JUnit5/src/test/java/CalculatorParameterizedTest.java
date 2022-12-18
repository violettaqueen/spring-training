import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Java", "JS", "TS"})
    void testCase1(String arg) {
        Assertions.assertFalse(arg.isEmpty());
    }
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void testCase1(int num) {
        Assertions.assertEquals(0, num % 3);
    }

}
