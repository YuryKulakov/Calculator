package main.java;

public class Main {
    public static void main(String[] args) throws DivideZeroException {
        int num1 = Calculator.getInt();
        int num2 = Calculator.getInt();
        char operation = Calculator.getOperation();
        int result = Calculator.calculate(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }
}
