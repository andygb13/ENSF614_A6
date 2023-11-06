package B;

import java.util.Vector;

public class BubbleSorter <E extends Number & Comparable<E>> implements Sorter<E>{

    public void sort(MyVector<E> vector){

        int n = vector.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (vec.get(i - 1).compareTo(vec.get(i)) > 0) {
                    // Swap vec[i-1] and vec[i]
                    E temp = vec.get(i - 1);
                    vec.set(i - 1, vec.get(i));
                    vec.set(i, temp);
                    swapped = true;
                }
            }
        } while (swapped);
    }
    
}
