package ru.cheb.lesson_5;

public class Main {

    public static void main(String[] args) {
        Cat catMurka = new Cat(); // отдельная кошка
        catMurka.age = 10;
        catMurka.name = "Мурка";
        catMurka.fill = 1;

        System.out.println("Сытость кошки до кормления - " + catMurka.fill);

        // создали объект кормушки
        catMurka.fill = eat(catMurka.fill);

        System.out.println("Сытость кошки - " + catMurka.fill);

    }

    static int eat(int currentFill) {
        int result = currentFill + 1;
        return result;
    }
}