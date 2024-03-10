package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OperatorTest {

    @Test
    void String값을_넣으면_Operator객체를_반환한다() {
        OperatorType operatorType = OperatorType.from("*");
        assertThat(operatorType).isEqualTo(OperatorType.TIMES);
    }

    @Test
    void 연산자에_해당하는_값이_아닐_시_예외를_발생시킨다() {

    }
}
