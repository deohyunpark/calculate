package com.example.calculate.refactor.third;

import com.example.calculate.refactor.fourth.PositiveNumber;

public interface NewArithmeticOperator {

    boolean support(String operator);

    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
