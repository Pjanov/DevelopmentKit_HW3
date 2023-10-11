package ru.pyanov.task_1;

public class Main {
    public static void main(String[] args) {
        int num_1 = 4;
        double num_2 = 5.5;

        double sum = Calculator.sum(num_1, num_2);
        System.out.println("Сумма: " + num_1 + " + " + num_2 + " = " + sum);

        double multiply = Calculator.multiply(num_1, num_2);
        System.out.println("Умножение: " + num_1 + " * " + num_2 + " = " + multiply);

        double divide = Calculator.divide(num_1, num_2);
        System.out.println("Деление: " + num_1 + " / " + num_2 + " = " + divide);

        double subtract = Calculator.subtract(num_1, num_2);
        System.out.println("Вычитание: " + num_1 + " - " + num_2 + " = " + subtract);
    }
}
