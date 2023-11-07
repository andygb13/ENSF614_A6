package D;

import java.util.ArrayList;

public class DoubleArrayListSubject implements Subject {
    private ArrayList<Double> data;

    DoubleArrayListSubject(){
        this.data = new ArrayList<>();
    }

    @Override
    public void addData(double item){

    }

    @Override
    public void setData(double data, int index) {
        this.data.add(index, data);
    }

    @Override
    public void populate(double[] arr){
        
    }

    @Override
    public void display(){

    }
    
}
