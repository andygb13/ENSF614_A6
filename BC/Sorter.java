package BC;

public interface Sorter<E extends Number & Comparable<E>> {

    public void sort(MyVector<E> vector);
    
}
