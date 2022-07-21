package org.syc.liner;

import java.util.Arrays;

public class MyArrayList<E> extends MyAbstractList<E> {

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
