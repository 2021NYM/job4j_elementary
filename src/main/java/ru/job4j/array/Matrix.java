package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] mult = new int[size][size];
        for (int raw = 0; raw < size; raw++) {
            for (int cell = 0; cell < size; cell++) {
                mult[raw][cell] = (raw + 1) * (cell + 1);
            }
        }
        return mult;
    }
}
