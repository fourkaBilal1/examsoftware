public interface IntegerBasicContainer {

    /** Add specified element into this container, throw an exception if not enough space is present
     *
     * @return true if the element was successfully added
     * @throws IndexOutOfBoundsException if this heap is empty
     */
    boolean insertElement(Integer e);

    /** Retrieves (without removing) an element of this container, throw an exception if the container is empty
     *
     * @return the highest element of this container
     * @throws NoSuchElementException if this heap is empty
     */
    Integer element();

    /** Retrieves (and remove) an element from this container, throw an exception if the container is empty
     *
     * @return an element of this container
     * @throws NoSuchElementException if this container is empty
     */
    Integer popElement();

    /** Returns the number of elements contained in this container */
    int size();

    /** Returns the maximal capacity of this container */
    int capacity();
}
