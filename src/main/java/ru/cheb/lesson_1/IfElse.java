package ru.cheb.lesson_1;

public class IfElse {

    public static void main(String[] args) {

        int cat = 12;

        if (cat < 5) {
            System.out.println("Кошек меньше 5, а сейчас их " + cat);
        } else {
            System.out.println("Кошек больше или равно 5, а сейчас их " + cat);
        }
    }
}