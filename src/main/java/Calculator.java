package main.java;

import java.util.Scanner;

public class Calculator {


    static Scanner scan = new Scanner(System.in);

    int test() throws DivideZeroException {

        String str = scan.nextLine();

        return calculate(Parser.pars(str));
    }


    public static int calculate(Operation operation) throws DivideZeroException {
        int result;
        switch (operation.getOperation()) {
            case "+":
                result = operation.getLeftOp() + operation.getRightOp();

                break;

            case "-":
                result = operation.getLeftOp() - operation.getRightOp();
                break;

            case "*":
                result = operation.getLeftOp() * operation.getRightOp();
                break;

            case "/":
                if (operation.getRightOp() == 0) {
                    throw new DivideZeroException();
                }
                result = operation.getLeftOp() / operation.getRightOp();
                break;

            default:
                System.out.println("Ввод был не верный, повторите еще раз.");

                result = -1;

        }
        return result;
    }
}

