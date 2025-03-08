package ru.cheb.lesson_6;

import java.util.Scanner;

/**
 * Калькулятор Варвары
 */
public class ProgramVarvara {


    public static void main (String args[]){

        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя первое число
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        // Запрашиваем у пользователя второе число
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        // Запрашиваем у пользователя операцию
        System.out.print("Выберите операцию (+, -,*, /): ");
        String operation = scanner.next();


        double result;
        if (operation.equals("+")){
            result = sum(num1,num2);
            System.out.println(result);
        }
        else if (operation.equals("-")){
            result = minus(num1,num2);
            System.out.println(result);

        }
        else if (operation.equals("*")){
            result = multi(num1,num2);
            System.out.println(result);

        }
        else if (operation.equals("/")){
            result = division(num1,num2);
            System.out.println(result);

        }




    }

    static double sum(double x,double y){
        double r=x + y;
        return r;

    }
    static double minus(double x,double y){
        double r=x - y;
        return r;

    }
    static double multi(double x,double y){
        double r=x * y;
        return r;

    }
    static double division(double x,double y){
        double r=x / y;
        return r;

    }
}
