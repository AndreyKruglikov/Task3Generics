package com.company.pecs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionUtils {

    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> int indexOf(List<? extends T> source, T t) {
        return source.indexOf(t);
    }

//    public static List limit(List source, int size) {
//    }

    public static <T> void add(List<? super T> source, T t) {
        source.add(t);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<? super T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static <T> boolean containsAny(List<? super T> c1, List<? extends T> c2) {
        for (T t : c2) {
            if (c1.contains(t))
                return true;
        }
        return false;
    }

    public static <T extends Comparable<? super T>> List<? extends T> range(List<? extends T> list, T min, T max) {
        List<? extends T> inner = list.stream().sorted((o1, o2) -> (o1).compareTo(o2)).collect(Collectors.toList());
        return inner.subList(inner.indexOf(min), inner.indexOf(max) + 1);
    }

    public static <T> List<? extends T> range(List<? extends T> list, T min, T max, Comparator<? super T> comparator) {
        List<? extends T> inner = list.stream().sorted(comparator).collect(Collectors.toList());
        return inner.subList(inner.indexOf(min), inner.indexOf(max) + 1);
    }

}
