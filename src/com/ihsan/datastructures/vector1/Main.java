package com.ihsan.datastructures.vector1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Play With Objects");
/*
        MyObj list = new MyObj();
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=5;i++) list.insert(i);
        list.display();
        for(int i=0;i<5;i++) list.delete();
        list.display();

        list.insert(23);
        list.display();
        System.out.println("Enter the number of elements");
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            list.insert(i+1);
        }

        list.display();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = input.nextInt();
        VectorSample vect = new VectorSample(n);
        System.out.print("Enter your " + n + " elements: ");
        for(int i=0;i<n;i++){
            int ele = input.nextInt();
            vect.insert(ele);
        }
        vect.display();
        vect.insertFirst(12);
        vect.display();

        vect.deleteLast();
        vect.display();
*/

        VectorSample list = new VectorSample(new int[]{1, 2, 3, 4, 5, 6});
//        list.insertAt(0,12);
//        list.insertAt(9,89);
        System.out.println(list.getCount());
        System.out.println(list.getSize());
        list.insertAt(3,34);
        list.display();
        list.deleteAt(3);
        System.out.println(list);


    }
}
