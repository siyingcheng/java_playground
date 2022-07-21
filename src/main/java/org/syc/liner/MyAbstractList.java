package org.syc.liner;

import java.util.Objects;

public abstract class MyAbstractList<E> implements IList<E> {
    protected static final int DEFAULT_CAPACITY = 10;

    protected static final Objects[] EMPTY_ELEMENTS = {};

    /**
     * The size of the MyArrayList(the number of elements it contains.).
     */
    protected int size = 0;

    /**
     * The array buffer into which the elements of the MyArrayList are stored.
     */
    transient Object[] elementData;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    protected void checkIndexForAdd(int index) {
        Objects.checkIndex(index, size + 1);
    }

    /**
     * Checks if the index is within the bounds of the range from 0(inclusive) to {@link #size}(exclusive).
     *
     * @param index the index
     * @throws IndexOutOfBoundsException if the index out of bounds
     */
    protected void checkIndex(int index) {
        Objects.checkIndex(index, size);
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < elementData.length; i++) {
            if (e == null) {
                if (elementData[i] == null) {
                    return i;
                }
            } else {
                if (e.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return ELEMENT_NOT_FOUND;
    }
}
