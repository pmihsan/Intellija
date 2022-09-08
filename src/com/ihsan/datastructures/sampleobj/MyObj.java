package com.ihsan.datastructures.sampleobj;

// Simple Array List format
public class MyObj {
    int size = 5;
    int i = 0;
    int[] arr;

    MyObj(){
        arr = new int[size];
    }

    MyObj(int val){
        size = val;
        arr = new int[val];
    }

    public int getCount() {
        return i;
    }

    public int getSize() {
        return size;
    }

    public void insert(int val){
        if(i == size){
            size = size * 2;
            copyArray();
            System.out.println("Array List Doubled, size " + size);
        }
        arr[i] = val;
        i++;
    }

    public void copyArray() {
        int[] nums = new int[size];
        for(int s=0;s<i;s++){
            nums[s] = arr[s];
        }
        arr = nums;
    }

    public void delete(){
        int j;
        for(j=0;j<i-1;j++){
            arr[j] = arr[j+1];
        }
        i--;
    }

    public void display(){
        for(int j=0;j<i;j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}
