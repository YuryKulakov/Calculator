package main.java;

import java.util.Scanner;

public class Calculator {

    static Scanner scan = new Scanner(System.in);

    static int test () throws DivideZeroException {

       int calculate;

        String str = scan.nextLine();//Принимает на ввод строку

        String operator = str.replaceAll("\\b\\d+\\b", "").trim();

        int operand = str.indexOf(operator);

        String afterOp = str.substring(operand + 1).replaceAll(" ", "");

        String beforeOp = str.substring(0, operand).replaceAll(" ", "");
        ;//Возвращает нам строку до знака операции

        Integer rightOperand = Integer.valueOf(afterOp);

        Integer leftOperand = Integer.valueOf(beforeOp);

        return calculate(rightOperand,leftOperand,operator);
    }


    public static int getInt() {
        System.out.println("Введите число: ");

        int num;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Вы допустили ошибку, попробуйте еще раз.");

            scan.next();
            num = getInt();

        }
        return num;
    }

    public static char getOperation() {
        System.out.print("Введите операцию: ");

        char operation;

        if (scan.hasNext()) {
            operation = scan.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку, повторите ввод.");
            scan.next();

            operation = getOperation();

        }
        return operation;
    }

    public static int calculate(int num1, int num2, String operation) throws DivideZeroException {
        int result;
        switch (operation) {
            case "+":
                result = num1 + num2;

                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if (num2 == 0) {
                    throw new DivideZeroException();
                }
                result = num1 / num2;
                break;

            default:
                System.out.println("Ввод был не верный, повторите еще раз.");

                result = -1;

        }
        return result;
    }
}
