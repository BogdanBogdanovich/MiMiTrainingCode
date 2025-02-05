package ru.cheb.lesson_2;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя первое число
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        // Запрашиваем у пользователя второе число
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        // Запрашиваем у пользователя операцию
        System.out.print("Выберите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Переменная для хранения результата
        double result;

        // Выполняем операцию в зависимости от выбора пользователя
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Проверяем, чтобы второе число не было нулем
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return; // Завершаем программу, если деление на ноль
                }
                break;
            default:
                System.out.println("Ошибка: неверная операция!");
                return; // Завершаем программу, если операция неверная
        }

        // Выводим результат
        System.out.println("Результат: " + result);
    }
}