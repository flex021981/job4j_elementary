package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        for (int indexRsl = 0; indexRsl < rsl.length; indexRsl++) {
            if (indexLeft > left.length - 1) {
                rsl[indexRsl] = right[indexRight];
                indexRight++;
            } else if (indexRight > right.length - 1) {
                rsl[indexRsl] = left[indexLeft];
                indexLeft++;
            } else if (left[indexLeft] < right[indexRight]) {
                rsl[indexRsl] = left[indexLeft];
                indexLeft++;
            } else {
                rsl[indexRsl] = right[indexRight];
                indexRight++;
            }
        }
        /*System.arraycopy(left, 0, rsl, 0, left.length);
        System.arraycopy(right, 0, rsl, left.length, right.length);
        Arrays.sort(rsl);*/
        return rsl;

    }
}
