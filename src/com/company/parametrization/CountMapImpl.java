package com.company.parametrization;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountMapImpl<T> implements CountMap<T> {

    Map<T, Integer> innerMap = new HashMap<>();

    @Override
    public void add(T t) {
        innerAdd(t);
    }

    @Override
    public int getCount(T t) {
        return innerMap.get(t);
    }

    @Override
    public int remove(T t) {
        return innerMap.remove(t);
    }

    @Override
    public int size() {
        return innerMap.size();
    }

    @Override
    public void addAll(CountMap<? extends T> source) {
        for (T t : source.toMap().keySet()) {
            innerAdd(t);
        }
    }

    @Override
    public Map<T, Integer> toMap() {
        return innerMap;
    }

    @Override
    public void toMap(Map<? super T, Integer> destination) {
        if (destination.isEmpty()) {
            destination.putAll(toMap());
        } else {
            for (T t : toMap().keySet()) {
                if (!destination.containsKey(t)){
                    destination.put(t, 1);
                } else {
                    destination.replace(t, destination.get(t) + innerMap.get(t));
                };
            }
        }
    }

    private void innerAdd(T t) {
        if (!innerMap.containsKey(t)){
            innerMap.put(t, 1);
        } else {
            innerMap.replace(t, innerMap.get(t)+1);
        }
    }
}
