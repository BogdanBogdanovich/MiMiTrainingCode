package ru.cheb.lesson_1;

public class Cat {

    String name = "Мурка";

    boolean голодная = true;

    public static void main(String[] args) {

        // создали кошку по описанию класса Cat (т.е. класс это фактически описание, по которому мы потом создаём объект)
        Cat cat = new Cat();

        // вызываем у объекта cat1 метод - may()
        cat.may();

        // вызываем у объекта cat1 метод - кушать_Или_Нет()
        cat.кушать_Или_Нет();
    }

    // метод для того, чтобы кошка мяукала
    private void may() {
        System.out.println("Мяу, мяу!");
    }



    private void кушать_Или_Нет() {
        if (голодная) {
            кушать();
            голодная = false;
        } else {
            попить();
        }
    }



    private void кушать() {
        System.out.println("Покушала!");
    }

    private void попить() {
        System.out.println("Попила!");
    }
}
