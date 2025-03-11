package org.example;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class CollectionUtilsTest {

    @Test
    public void testFilter() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = CollectionUtils.filter(numbers, n -> n > 3);
        assertEquals(Arrays.asList(4, 5), result);
    }

    @Test
    public void testSort() {
        List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> result = CollectionUtils.sort(numbers);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), result);
    }



    @Test
    public void testSplit() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<List<Integer>> result = CollectionUtils.split(numbers, 2);
        assertEquals(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5)), result);
    }

    @Test
    public void testMerge() {
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<Integer> result = CollectionUtils.merge(list1, list2);
        assertEquals(Arrays.asList(1, 2, 3, 4), result);
    }
}
