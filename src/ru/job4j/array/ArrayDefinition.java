package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        System.out.println("Размер массива равен " + ages.length);
        System.out.println("Размер массива равен " + surnames.length);
        System.out.println("Размер массива равен " + prices.length);

        System.out.println();
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Nikolay Nikolaev";
        names[3] = "Nikolay Ivanov";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println();
        for (String element : names) {
            System.out.println(element);
        }
    }
}
