package main.java;

public class Parser {


    public static Operation pars(String operation) {
      if (operation != null && operation.length()> 0) {

          String operator = operation.replaceAll("\\b\\d+\\b", "").trim();

          int operand = operation.indexOf(operator);

          String afterOp = operation.substring(operand + 1).replaceAll(" ", "");

          String beforeOp = operation.substring(0, operand).replaceAll(" ", "");


          int rightOperand = Integer.parseInt(afterOp);

          int leftOperand = Integer.parseInt(beforeOp);

          return new Operation(operator, leftOperand, rightOperand);
      }else {
          throw new ArithmeticException("Не попал!");
      }
    }

}
