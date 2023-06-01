package com.example.javaproject2.week7.day30_31.opgame.servie;

public class PlusOperatorLevelOne implements IOperator{
    int a, b;

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void generateQuestion(int max) {
        a = (int)(Math.random() * max);
        b = max - 1 - a;
    }

    @Override
    public String getQuestionMsg() {
        return String.format("%d + %d = ", a, b);
    }

    @Override
    public boolean isEquals(int answer) {
        return (a + b) == answer;
    }
}
