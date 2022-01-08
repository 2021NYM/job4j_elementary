package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom40To56Is432() {
        int start = 40;
        int finish = 56;
        int result = Counter.sumByEven(start, finish);
        int expected = 432;
        Assert.assertEquals(expected, result);
    }
}