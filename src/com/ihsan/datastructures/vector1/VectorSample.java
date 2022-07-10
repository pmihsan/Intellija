package com.ihsan.datastructures.vector1;

public class VectorSample {
    int size = 10;
    int p = 0;
    int[] arr;

    public VectorSample(int[] arr) {
        this.size = this.p = arr.length;
        this.arr = arr;
    }

    public VectorSample(int s){
        this.size = s;
        this.arr = new int[s];
    }

    public VectorSample(){
        this.arr = new int[size];
    }

    public int getSize(){
        return size;
    }

    public int getCount(){
        return p;
    }

    public void insert(int val){
        if(p >= size){
            size = size * 2;
            copyArray();
//            System.out.println("Array List Doubled, size " + size);
        }
        arr[p] = val;
        p++;
    }

    public void insertFirst(int val){
        if(p >= size){
            size = size * 2;
            copyArray();
//            System.out.println("Array List Doubled, size " + size);
        }
        for(int i=p;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = val;
        p++;
    }

    public void insertAt(int pos, int val){
        if(pos >= p){
//            System.out.println("Invalid Position");
            return;
        }
        if(pos == 0) {
            insertFirst(val);
            return;
        }
        if(pos == p-1){
            insert(val);
            return;
        }
        if(p >= size){
            size = size * 2;
            copyArray();
//            System.out.println("Array List Doubled, size " + size);
        }
        for(int i=p;i>pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = val;
        p++;
    }

    public void copyArray() {
        int[] nums = new int[size];
        for(int s=0;s<p;s++){
            nums[s] = arr[s];
        }
        arr = nums;
    }

    public void delete(){
        int j;
        for(int i=0;i<p-1;i++) arr[i] = arr[i+1];
        arr[p-1] = 0;
        p--;
    }

    public void deleteAt(int ind){
        if(ind >= p){
//            System.out.println("Invalid Position");
            return;
        }
        if(ind == p - 1){
            deleteLast();
            return;
        }
        if(ind == 0){
            delete();
            return;
        }
        for(int i=ind;i<p-1;i++){
            arr[i] = arr[i+1];
        }
        p--;
    }

    public void deleteLast(){
        arr[p-1] = 0;
        p--;
    }

    public void display(){
        for(int j=0;j<p;j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        String s = "[";
        for(int i=0;i<p-1;i++){
         s += arr[i] + ", ";
        }
        s += arr[p-1];
        return s + "]";
    }

}
