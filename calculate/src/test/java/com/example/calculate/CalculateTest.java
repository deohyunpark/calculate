package com.example.calculate;

import com.example.calculate.refactor.first.Calculator;
import com.example.calculate.refactor.fourth.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculateTest {

    @DisplayName("사칙 연산을 수행한다")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculateTest(PositiveNumber operand1, String operator, PositiveNumber operand2, int result) {
        //변수로 뺴기 -> 옵션 커맨드 브이
        int calculateResult = Calculator.calculate(operand1, operator, operand2);

        assertThat(calculateResult).isEqualTo(result);
    }

    @DisplayName("인자를 0으로 나누었을때 예외 발생")
    @Test
    void calculateExceptionTest() {
        assertThatCode(() -> Calculator.calculate(new PositiveNumber(10), "/", new PositiveNumber(0)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(5, "-", 3, 2),
                arguments(4, "*", 2, 8),
                arguments(4, "/", 2, 2)
        );
    }
}
