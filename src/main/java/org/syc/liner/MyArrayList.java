package org.syc.liner;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> implements IList<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private static final Objects[] EMPTY_ELEMENTS = {};

    /**
     * The size of the MyArrayList(the number of elements it contains.).
     */
    private int size = 0;

    /**
     * The array buffer into which the elements of the MyArrayList are stored.
     */
    transient Object[] elementData;

    /**
     * Constructs an empty list with the specified initial capacity.
     *
     * @param capacity the initial capacity of the list
     * @throws IllegalArgumentException if the initial capacity is negative
     */
    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity:" + capacity);
        } else {
            elementData = new Object[capacity];
        }
    }

    /**
     * Constructs an empty list with an initial capacity of {@link #DEFAULT_CAPACITY}
     */
    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

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

    @Override
    public void add(E e) {
        ensureCapacity();
        elementData[size++] = e;
    }

    /**
     * Increases the capacity of MyArrayList instance, if necessary, to ensure that it
     * can hold a new element which will be added.
     */
    private void ensureCapacity() {
        if (size == elementData.length) {
            grow();
        }
    }

    /**
     * Increases the capacity to ensure that it can hold a new element which will be added.
     */
    private void grow() {
        int oldCapacity = elementData.length;
        if (oldCapacity > 0) {
            int newCapacity = oldCapacity + (oldCapacity >> 1); // 1.5
            elementData = Arrays.copyOf(elementData, newCapacity);
        } else {
            elementData = new Object[Math.max(size + 1, DEFAULT_CAPACITY)];
        }
    }

    @Override
    public void add(int index, E e) {
        checkIndexForAdd(index);
        ensureCapacity();
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = e;
        size++;
    }

    private void checkIndexForAdd(int index) {
        Objects.checkIndex(index, size + 1);
    }

    /**
     * Checks if the index is within the bounds of the range from 0(inclusive) to {@link #size}(exclusive).
     * @param index the index
     * @throws IndexOutOfBoundsException if the index out of bounds
     */
    private void checkIndex(int index) {
        Objects.checkIndex(index, size);
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        @SuppressWarnings("unchecked")
        E element = (E) elementData[index];
        return element;
    }

    @Override
    public E set(int index, E e) {
        checkIndex(index);
        @SuppressWarnings("unchecked")
        E oldElement = (E) elementData[index];
        elementData[index] = e;
        return oldElement;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        @SuppressWarnings("unchecked")
        E oldElement = (E) elementData[index];
        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        elementData[--size] = null;
        return oldElement;
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

    @Override
    public void clear() {
        final Object[] es = elementData;
        for (int to = size, i = size = 0; i < to; i++) {
            es[i] = null;
        }
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "size=" + size +
                ", elementData=" + Arrays.toString(elementData) +
                '}';
    }
}
