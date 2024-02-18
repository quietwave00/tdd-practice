package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class InputNumberTest {


    @Test
    void String값을_넣으면_int타입으로_저장한다() {
        InputNumber result = new InputNumber("3");
        assertThat(result.getInputNumber()).isEqualTo(3);
    }

    @Test
    void 숫자가_아닐때_예외를_발생한다() {
        assertThatThrownBy(() -> new InputNumber("s")).isInstanceOf(RuntimeException.class);
    }
}
