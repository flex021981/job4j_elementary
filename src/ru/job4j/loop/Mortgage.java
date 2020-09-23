package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent /= 100;
        while (amount > 0) {
            amount = (int) (amount + (amount * percent));
            amount -= salary;
            year++;
        }
        return year;
    }
}
