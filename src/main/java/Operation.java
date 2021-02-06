package main.java;

public class Operation {

    private String operation;

    private int leftOp;

    private int rightOp;

    public Operation(String operator, int leftOperand, int rightOperand) {

        this.operation = operator;

        this.leftOp = leftOperand;

        this.rightOp = rightOperand;

    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getLeftOp() {
        return leftOp;
    }

    public void setLeftOp(int leftOp) {
        this.leftOp = leftOp;
    }

    public int getRightOp() {
        return rightOp;
    }

    public void setRightOp(int rightOp) {
        this.rightOp = rightOp;
    }
}
