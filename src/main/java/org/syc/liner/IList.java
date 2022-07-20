package org.syc.liner;

public interface IList<E> {
    int ELEMENT_NOT_FOUND = -1;

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements int this list.
     */
    int size();

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements.
     */
    boolean isEmpty();

    /**
     * Returns true if this list contains the specified element.
     *
     * @param e element whose presence in this collection is to be tested
     * @return true if this list contains the specified element.
     */
    boolean contains(E e);

    /**
     * Appends the specified element to the end of this list.
     *
     * @param e element to be appended to this list
     */
    void add(E e);

    /**
     * Inserts the specified element into this list at the specified position.
     *
     * @param index index at which to insert the specified element
     * @param e     element to be inserted into this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    void add(int index, E e);

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    E get(int index);

    /**
     * Replaces the element at the specified position in this list with the specified element.
     *
     * @param index index of the element to replace
     * @param e     element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    E set(int index, E e);

    /**
     * Removes the element at the specified position in this list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    E remove(int index);

    /**
     * Returns the index of the first occurrence of the specified element in this list,
     * or -1 if this list does not contains the element.
     *
     * @param e element to search for
     * @return the index of the first occurrence of the specified element in this list,
     * or {@link #ELEMENT_NOT_FOUND} if this list does not contains the element
     */
    int indexOf(E e);

    /**
     * Removes all of the elements from this list. The list will be empty after this call returns.
     */
    void clear();
}
