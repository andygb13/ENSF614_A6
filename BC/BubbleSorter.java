package BC;

import java.util.ArrayList;

public class BubbleSorter <E extends Number & Comparable<E>> implements Sorter<E>{

    public void sort(MyVector<E> vector){
        ArrayList<Item<E>> items = vector.getItems();
        int n = items.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (items.get(j).compareTo(items.get(j + 1)) > 0) {
                    // Swap items[j] and items[j+1]
                    Item<E> temp = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, temp);
                }
            }
        }

    }  
}
