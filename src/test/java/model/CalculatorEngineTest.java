package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CalculatorEngineTest {

    private CalculatorEngine calculatorEngine;

    @BeforeEach
    void setUp() {
        calculatorEngine = new CalculatorEngine();
    }

    @Test
    void 덧셈_연산을_한다() {
        final int result = calculatorEngine.plus(1, 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void 뺄셈_연산을_한다() {
        final int result = calculatorEngine.minus(1, 2);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void 곱셈_연산을_한다() {
        final int result = calculatorEngine.times(1, 2);
        assertThat(result).isEqualTo(2);
    }

    @ParameterizedTest
    @MethodSource("provideDivideParameter")
    void 나눗셈_연산을_한다(final int target, final int number, final int expect) {
        final int result = calculatorEngine.divide(target, number);
        assertThat(result).isEqualTo(expect);
    }

    private static List<Arguments> provideDivideParameter() {
        return List.of(
                Arguments.of(1, 2, 0),
                Arguments.of(4, 2, 2),
                Arguments.of(9, 3, 3)
        );
    }
}
