package BC;

import java.util.ArrayList;

public class SelectionSorter<E extends Number & Comparable<E>> implements Sorter<E> {

    @Override
    public void sort(MyVector<E> vector) {
        ArrayList<Item<E>> items = vector.getItems();
        int n = items.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (items.get(j).compareTo(items.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swap the elements
            Item<E> temp = items.get(i);
            items.set(i, items.get(minIndex));
            items.set(minIndex, temp);
        }
    }
}
