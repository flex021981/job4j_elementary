package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        boolean lenBoolean = array.length % 2 == 0;
        int temp = 0;
        int lenInt = lenBoolean ? array.length / 2 : (array.length + 1) / 2;
        for (int i = 0; i < lenInt; i++) {
            temp = array[i];
            array[i] = array[lenInt + 1 - i];
            array[lenInt + 1 - i] = temp;
        }
        return array;
    }
}
