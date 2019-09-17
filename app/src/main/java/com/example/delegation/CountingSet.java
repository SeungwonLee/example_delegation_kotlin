package com.example.delegation;

import java.util.Collection;
import java.util.HashSet;

public class CountingSet extends HashSet<Long> {
    private long addedCount = 0;

    @Override
    public boolean add(Long aLong) {
        addedCount++;
        return super.add(aLong);
    }

    @Override
    public boolean addAll(Collection<? extends Long> c) {
        addedCount = addedCount + c.size();
        return super.addAll(c);
    }

    public long getAddedCount() {
        return addedCount;
    }
}
