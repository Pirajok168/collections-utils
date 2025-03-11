package org.example;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionUtils {

    public static <T> List<T> filter(Collection<T> collection, Predicate<T> predicate) {
        return collection.stream().filter(predicate).collect(Collectors.toList());
    }

    public static <T extends Comparable<T>> List<T> sort(Collection<T> collection) {
        return collection.stream().sorted().collect(Collectors.toList());
    }


    public static <T> List<List<T>> split(Collection<T> collection, int size) {
        List<List<T>> result = new ArrayList<>();
        List<T> tempList = new ArrayList<>();
        for (T item : collection) {
            tempList.add(item);
            if (tempList.size() == size) {
                result.add(new ArrayList<>(tempList));
                tempList.clear();
            }
        }
        if (!tempList.isEmpty()) {
            result.add(tempList);
        }
        return result;
    }

    public static <T> List<T> merge(Collection<T> collection1, Collection<T> collection2) {
        List<T> merged = new ArrayList<>(collection1);
        merged.addAll(collection2);
        return merged;
    }
}
