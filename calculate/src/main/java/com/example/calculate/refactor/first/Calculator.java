package com.example.calculate.refactor.first;

import com.example.calculate.refactor.second.ArithmeticOperator;
import com.example.calculate.refactor.third.*;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 기존 코드
//    public static int calculate(int operand1,String operator ,int operand2 ) {
//        if (operator.equals("+")) {
//            return operand1 + operand2;
//        } else if (operator.equals("-")) {
//            return operand1 - operand2;
//        } else if (operator.equals("*")) {
//            return operand1 * operand2;
//        } else if (operator.equals("/")) {
//            return operand1 / operand2;
//        }
//
//        return 0;
//    }

    // 첫번째 리팩토링
//    public static int calculate(int operand1, String operator, int operand2) {
//        return ArithmeticOperator.calculate(operand1, operator, operand2);
//    }
    public static final List<NewArithmeticOperator> CALCULATOR = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    // 두번째 리팩토링
    public static int calculate(int operand1, String operator, int operand2) {
        return CALCULATOR.stream()
                .filter(newArithmeticOperator -> newArithmeticOperator.support(operator))
                .map( newArithmeticOperator -> newArithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow( () -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));


    }
}
