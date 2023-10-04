package com.example.calculate.refactor.third;

public class SubtractionOperator implements NewArithmeticOperator {
    @Override
    public boolean support(String operator) {
        return false;
    }

    @Override
    public int calculate(int operand1, int operand2) {
        return 0;
    }
}
