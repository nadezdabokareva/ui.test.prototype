package test.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParametrizedTest {

    @DisplayName("Параметризованный тест с одним параметром")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void parametrizedTestWithOneParam(int number) {
        assertTrue(number > 0);
    }

    @DisplayName("Параметризованный тест с несколькими параметрами")
    @ParameterizedTest
    @CsvSource({
            "Hello, 5",
            "JUnit, 4",
            "Parameterized, 13",
            "Test, 4",
            "Example, 7"
    })
    void testStringLength(String input, int expectedLength) {
        assertEquals(expectedLength, input.length());
    }

    @DisplayName("Параметризованный тест с использованием метода для предоставления параметров")
    @ParameterizedTest
    @MethodSource("provideNumbers")
    void testIsPositive(int number) {
        assertTrue(number > 0);
    }

    static Stream<Integer> provideNumbers() {
        return Stream.of(1, 2, 3, 4, 5);
    }
    @DisplayName("Параметризованный тест с использованием файла CSV")
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void testIsPositiveFromFile(int number) {
        assertTrue(number > 0);
    }
}
