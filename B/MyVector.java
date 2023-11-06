package B;

import java.util.ArrayList;

public class MyVector<E extends Number & Comparable<E> >{

    private ArrayList<Item<E>> storageM;
    private Sorter<E> sorter;

    MyVector(int n){
        this.storageM = new ArrayList<>(n);
    }

    MyVector(ArrayList<E> arr){
        this.storageM = new ArrayList<>(arr.size());
        for (E element : arr) {
            storageM.add(new Item<>(element));
        }
    }

    //That allows to add a new Item value to storageM 
    public void add(Item value){

    }

    //That allows its private data member register with a an object that implements Sorter. 
    public void setSortStrategy(Sorter s){

    }

    //That allows sort method of any sorter object to be called. 
    public void performSort(){

    }
    
    //That displays data values stored in storage on the screen in one line. For example:  1.0  2.0  3.0  4.0  5.0 
    public void display(){

    }
}
