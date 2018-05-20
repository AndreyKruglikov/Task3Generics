package com.company;

import com.company.parametrization.CountMap;
import com.company.parametrization.CountMapImpl;
import com.company.pecs.CollectionUtils;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       /* CountMap<Integer> countMap = new CountMapImpl<>();
        countMap.add(10);
        countMap.add(10);
        countMap.add(5);
        countMap.add(6);
        countMap.add(5);
        countMap.add(10);
        System.out.println(countMap.getCount(5));
        System.out.println(countMap.getCount(6));
        System.out.println(countMap.getCount(10));

        Map<Integer, Integer> map = new HashMap<>();

        map.put(5, 5);
        System.out.println(map);

        countMap.toMap(map);
        System.out.println(map)*/;

        List<Integer> list1 = Arrays.asList(8,1,3,5,6, 4);
        System.out.println(CollectionUtils.range(list1, 3, 8));

        List<Integer> list2 = Arrays.asList(8,1,3,5,6, 4);
        System.out.println(CollectionUtils.range(list2, 3, 8, (o1, o2) -> o1.compareTo(o2)));
    }
}
