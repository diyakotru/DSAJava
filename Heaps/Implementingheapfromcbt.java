package DSAJava.Heaps;

import java.util.ArrayList;
import java.util.Collections;

class Heap{
    ArrayList<Integer>maxheap;
    public Heap(){
        maxheap=new ArrayList<>();
    }
    public Heap(int[]nums){
        //implement using array
        for(int i:nums){
            maxheap.add(i);
        }
        int n=maxheap.size();
        for(int j=(n/2)-1;j>=0;j--){
            heapify(j);
        }
    }
    public int peek(){
        if(maxheap.size()==0){
            return 0;
        }else{
            return maxheap.get(0);
        }
    }
    public void heapify(int index){
        int size = maxheap.size();
        int largest = index;

        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;

            largest = index;

            if (left < size && maxheap.get(left) > maxheap.get(largest)) {
                largest = left;
            }
            if (right < size && maxheap.get(right) > maxheap.get(largest)) {
                largest = right;
            }

            if (largest != index) {
                Collections.swap(maxheap, index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }

    public void insert(int val){
        maxheap.add(val);
        int index=maxheap.size()-1;
        int parent=(index-1)/2;
        while(index > 0 && maxheap.get(parent) < maxheap.get(index)){
            Collections.swap(maxheap, index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }
    public void pop(){
        if (maxheap.size() == 0) return;
        Collections.swap(maxheap, 0, maxheap.size() - 1);
        maxheap.remove(maxheap.size() - 1);
        heapify(0);
    }
    public void print(){
        for(int i=0;i<maxheap.size();i++){
            System.out.println(maxheap.get(i));
        }
    }
    public void heapify(int index,int size){
        int largest = index;

        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;

            largest = index;

            if (left < size && maxheap.get(left) > maxheap.get(largest)) {
                largest = left;
            }
            if (right < size && maxheap.get(right) > maxheap.get(largest)) {
                largest = right;
            }

            if (largest != index) {
                Collections.swap(maxheap, index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }
    public void sort(){
        for(int i=maxheap.size()-1;i>=0;i--){
                Collections.swap(maxheap, 0, i);
                heapify(0,i);
        }
    }
}

public class Implementingheapfromcbt {
    public static void main(String[] args) {
        Heap mhep=new Heap();
        mhep.insert(34);
        mhep.insert(14);
        mhep.insert(4);
        mhep.insert(94);
        mhep.print();
    }
}
