import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class CalculatorParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Java", "JS", "TS"})  // for each test data, test runs 3 times
    void testCase1(String arg) {
        Assertions.assertFalse(arg.isEmpty());  // I am asserting if data from line 8 coming empty or not, returning false
    }
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9}) // if these nums in param are divided by 3 or not
    void testCase1(int num) {
        Assertions.assertEquals(0, num % 3);  // it will pass if nums % 3 == 0 (expected)
    }
    @ParameterizedTest
    @ValueSource(strings = {"Java", "JS", "TS"})
//    @EmptySource            // ""   @EmptySource we can use with collections
//    @NullSource
    @NullAndEmptySource
    void testCase3(String arg) {
        Assertions.assertFalse(arg.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testCase4(String arg) {
        Assertions.assertFalse(arg.isEmpty());
    }

    static String[] stringProvider() {
        return new String[]{"Java", "JS", "TS"};
    }

    @ParameterizedTest
    @CsvSource({  // not common to use when we have a lot of data
            "10, 20, 30",
            "20, 20, 40",
            "30, 20, 100"
    })
    void testCase5(int num1, int num2, int result) {
        Assertions.assertEquals(result, Calculator.add(num1, num2));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sample-data.csv", numLinesToSkip = 1)  // better if we have much data
    void testCase6(int num1, int num2, int result) {
        Assertions.assertEquals(result, Calculator.add(num1, num2));
    }


}
