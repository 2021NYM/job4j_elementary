package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] mult = new int[size][size];
        for (int raw = 0; raw < mult.length; raw++) {
            for (int cell = 0; cell < mult[raw].length; cell++) {
                mult[raw][cell] = (raw + 1) * (cell + 1);
            }
        }
        return mult;
    }
}
