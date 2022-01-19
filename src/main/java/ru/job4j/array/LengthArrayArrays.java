package ru.job4j.array;

public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] numbers = {{10}, {100, 200}, {2, 4, 6}, {-1, -2, 1, 2}};
        for (int[] number: numbers) {
            System.out.println("Размер вложенного массива равен: " + number.length);
        }
    }
}
