package com.company;

import com.company.parametrization.CountMap;
import com.company.parametrization.CountMapImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        CountMap<Integer> countMap = new CountMapImpl<>();
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
        System.out.println(map);
    }
}
