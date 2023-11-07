package BC;

import java.util.ArrayList;

public class InsertionSorter<E extends Number & Comparable<E>> implements Sorter<E>{

    public void sort(MyVector<E> vector){
        ArrayList<Item<E>> items = vector.getItems();
        int n = items.size();

        for (int i = 1; i < n; i++) {
            Item<E> key = items.get(i);
            int j = i - 1;

            while (j >= 0 && key.compareTo(items.get(j)) < 0) {
                items.set(j + 1, items.get(j));
                j--;
            }

            items.set(j + 1, key);
        }
    }
    
}
