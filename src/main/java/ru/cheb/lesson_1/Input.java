package ru.cheb.lesson_1;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        // Шаг 1: Приветствие
        System.out.println("Привет! Давай узнаем, сколько тебе лет.");

        // Шаг 2: Запрос года рождения
        Scanner scanner = new Scanner(System.in); // Создаём объект Scanner

        String text = "Введите ваш год рождения: ";

        System.out.print(text);
        int birthYear = scanner.nextInt(); // Читаем год рождения

        // Шаг 3: Вычисление возраста
        int currentYear = 2024; // Текущий год
        int age = currentYear - birthYear; // Вычисляем возраст

        // Шаг 4: Вывод результата
        System.out.println("Вам " + age + " лет!");
    }
}