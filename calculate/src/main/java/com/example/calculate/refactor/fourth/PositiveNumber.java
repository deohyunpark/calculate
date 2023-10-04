package com.example.calculate.refactor.fourth;

public class PositiveNumber {

    private final int value;

    public PositiveNumber(int value) {
        validation(value);
        this.value = value;
    }

    private void validation(int value) {
        if (isNegativeNumber(value)) {
            throw new IllegalArgumentException("0 또는 음수 전달할 수 없습니다.");
        }
    }

    private boolean isNegativeNumber(int value) {
        return value <= 0;
    }

    public int toInt(){
        return value;
    }
}
