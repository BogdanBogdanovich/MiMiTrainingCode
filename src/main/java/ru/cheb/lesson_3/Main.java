package ru.cheb.lesson_3;

public class Main {

    public static void main(String[] args) {
        Cat catMurka = new Cat(); // отдельная кошка
        catMurka.возраст = 10;
        catMurka.кличка = "Мурка";

        System.out.println("Кошка по кличке - " + catMurka.кличка);
        System.out.println("Возраст кошки - " + catMurka.возраст);
        System.out.println("Сделала действие - " + catMurka.мяу());

        Cat catElizaveta = new Cat(); // вторая отдельная кошка
        catElizaveta.возраст = 50;
        catElizaveta.кличка = "Елизавета";

        System.out.println("Кошка по кличке - " + catElizaveta.кличка);
        System.out.println("Возраст кошки - " + catElizaveta.возраст);
        System.out.println("Сделала действие - " + catElizaveta.мяу());
    }
}