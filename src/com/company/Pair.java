package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Pair<I , S > {
    private I value1;
    private S value2;

    private Pair (I value1, S value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public static <I,S> Pair <I,S> of (I value1, S value2) {
        return new Pair<>(value1, value2);
    }


    public I getFirst() {

        return value1;
    }

    public S getSecond() {
        return value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(value1, pair.value1) && Objects.equals(value2, pair.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }
}
