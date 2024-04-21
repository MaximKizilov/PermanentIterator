package ru.netology;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min, max;

    protected Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }


    @NotNull
    @Override
    public Iterator iterator() {
        return new Iterator();
    }

    class Iterator implements java.util.Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return min + random.nextInt(max - min +1);
        }
    }
}


