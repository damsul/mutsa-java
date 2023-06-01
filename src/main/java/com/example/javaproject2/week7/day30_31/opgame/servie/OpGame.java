package com.example.javaproject2.week7.day30_31.opgame.servie;

public class OpGame {

    int remainingAnswers;
    String cheeringUpMsg = "한번 더 해보자";
    IOperator op;

    public OpGame(IOperator op) {
        this.op = op;
    }

    public void makeQuestion() {
        remainingAnswers = 3;
        op.setA(1);
        op.setB(1);
    }
    public void makeQuestion(int max) {
        op.generateQuestion(max);
    }

    public String getQuestion() {
        return op.getQuestionMsg();
    }

    public int getRemainingAnswers() {
        return remainingAnswers;
    }

    public boolean inAnswer(int answer) {
        remainingAnswers--;
        return op.isEquals(answer);
    }

    public String getCheeringUpMsg() {
        return cheeringUpMsg;
    }
}
