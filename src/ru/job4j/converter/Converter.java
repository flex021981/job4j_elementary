package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        in = 180;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println(in + " rubles are " + expected + " dollars. Test result : " + passed);

        /*int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");*/
    }
}
