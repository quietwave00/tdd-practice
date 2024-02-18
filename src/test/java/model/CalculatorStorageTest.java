package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CalculatorStorageTest {

    private CalculatorStorage calculatorStorage;

    @BeforeEach
    void setUp() {
        calculatorStorage = new CalculatorStorage();
    }

    @Test
    void 입력받은_숫자값을_저장하고_반환한다() {
        calculatorStorage.saveNumber(1);
        calculatorStorage.saveNumber(2);
        calculatorStorage.saveNumber(3);

        List<Integer> result = calculatorStorage.getNumbers();
        assertThat(result).isEqualTo(List.of(1, 2, 3));
    }

    @Test
    void 입력받은_연산기호를_저장한다() {
        calculatorStorage.saveOperation("+");
        calculatorStorage.saveOperation("-");
        calculatorStorage.saveOperation("*");
        calculatorStorage.saveOperation("/");

        List<String> result = calculatorStorage.getOperations();
        assertThat(result).isEqualTo(List.of("+", "-", "*", "/"));
    }
}
