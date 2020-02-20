package com.lsa.design_pattern.designpattern.decorator.withLombok;

import lombok.experimental.Delegate;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RemovalDelegate<E> implements List<E> {
    private final AtomicInteger removalCount = new AtomicInteger();

    @Delegate(excludes = ExcludedListMethods.class)
    private final List<E> delegate;

    public RemovalDelegate(List<E> delegate) {
        this.delegate = delegate;
    }

    @Override
    public boolean remove(Object o) {
        boolean isRemoved = delegate.remove(o);
        if (isRemoved) {
            System.out.println("Removal count: " + removalCount.incrementAndGet());
        }
        return isRemoved;
    }

    @Override
    public E remove(int index) {
        System.out.println("Removal count: " + removalCount.incrementAndGet());
        return delegate.remove(index);
    }

    private abstract class ExcludedListMethods {
        public abstract E remove(int index);

        public abstract boolean remove(Object o);

        //public abstract boolean add(E o);
    }
}

