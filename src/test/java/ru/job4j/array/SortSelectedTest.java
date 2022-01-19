package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {13, 24, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 13, 24};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {30, 30, 10, 20, 50};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 20, 30, 30, 50};
        Assert.assertArrayEquals(expected, result);
    }
}