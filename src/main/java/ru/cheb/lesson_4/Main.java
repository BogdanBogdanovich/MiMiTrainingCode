package ru.cheb.lesson_4;

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

        catMurka.fill = burnout("SJ");

    }

    static int eat(int currentFill) {
        int result = currentFill + 1;
        return result;
    }

    static int burnout(String qwerty) {
        System.out.println(qwerty);
        return 1;
    }
}