package com.company;
import java.util.Arrays;

public class DynamicArray <T> {
    T[] arr = (T[])new Object[0];

    private int i = 0;

    void add(T el){
        if (arr.length == i){
            arr = Arrays.copyOf(arr,(arr.length)+1);
        }
        arr [i] = el;
        i++;
    }

    void remove(int index){
        if(index > 0 && index <= arr.length-1){
            System.arraycopy(arr,index,arr,index-1,arr.length-index);
        }
        if (index == 0){
            System.arraycopy(arr,index+1,arr,0,arr.length-1);
        }
        i--;
    }

    public T getIndex(int index){
        return arr[index];
    }
    
}

