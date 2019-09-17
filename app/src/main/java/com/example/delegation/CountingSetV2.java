package com.example.delegation;

import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Sets;

import java.util.Collection;
import java.util.Set;

public class CountingSetV2 extends ForwardingSet<Long> {

    private final Set<Long> delegate = Sets.newHashSet();
    private long addedCount = 0L;

    @Override
    protected Set<Long> delegate() {
        return delegate;
    }

    @Override
    public boolean add(Long element) {
        addedCount++;
        return delegate().add(element);
    }

    @Override
    public boolean addAll(Collection<? extends Long> collection) {
        addedCount += collection.size();
        return delegate().addAll(collection);
    }
}
