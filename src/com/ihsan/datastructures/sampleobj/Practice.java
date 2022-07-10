package com.ihsan.datastructures.sampleobj;

public class Practice {
    public static void main(String[] args) {
        System.out.println("My Object File");
        MyObj list = new MyObj();
        MyObj list1 = new MyObj(10);

//        System.out.println(list.getCount());
//        System.out.println(list1.getCount());

        for(int i=1;i<=3;i++) list.insert(i);
        for(int i=1;i<=7;i++) list1.insert(i);

        list.display();
        list1.display();

        list.delete();
        list1.delete();

        list.display();
        list1.display();

        System.out.println(list.getCount());
        System.out.println(list1.getCount());




    }
}
