package org.example.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {

    public static void main(String[] args) {
        System.out.println("Welcome to linkedList");

        linkedListOpr();
    }

    private static void linkedListOpr() {

        LinkedList<Integer>list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(5);
        list.addLast(4);
        list.add(3,10);
        list.add(4,20);

        Iterator<Integer>itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" : ");
        }

        LinkedList<Integer>list1 = new LinkedList<>();
        list1.add(55);
        list1.add(65);
        list1.add(0,94);

        System.out.println();
        list.addAll(list1);
        itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" : ");
        }

        System.out.println();
        System.out.println("Set Operations ------------");
        list.set(1,77);
        list.set(6,6453);


        itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" : ");
        }

        System.out.println("\n Iterating with different ways");

        System.out.println("Using For Loop ");
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" : ");
        }

        System.out.println("\n Using for each loop ");
        for(Integer i : list){
            System.out.print(i+" : ");
        }

        System.out.println("\n Using List Iterator");
        ListIterator<Integer>l = list.listIterator();
        while (l.hasNext()){
            System.out.print(l.next()+" : ");
        }


    }
}
