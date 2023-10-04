package com.example.calculate.refactor.first;

import com.example.calculate.refactor.second.ArithmeticOperator;

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
    public static int calculate(int operand1, String operator, int operand2) {
        return ArithmeticOperator.calculate(operand1, operator, operand2);
    }
}
