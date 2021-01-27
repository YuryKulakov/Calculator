package main.java;

public class Main {
    public static void main(String[] args) throws DivideZeroException {
        Calculator fin = new Calculator();

        System.out.println("Результат операции: " + fin.test());
    }
}
