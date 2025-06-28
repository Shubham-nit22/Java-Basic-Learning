package org.example.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Employee{

    int id;
    String name;
    double salary;

    class Employee(int id,String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}


public class QueuePractice {

    public static void main(String[] args) {
        System.out.println("Welcome to Queue Practice");

        //queueLinkedListOpr();
        //queuePriorityQOpr();
         priorityQueueReverse();
    }

    private static void priorityQueueReverse(){

        PriorityQueue<Employee>pq = new PriorityQueue<>((e1,e2) -> e1.salary > e2.salary);
        Employee e1 = new Employee(101,"Vikram",75024.25);
        Employee e2 = new Employee(102,"Shashwat",64350.25);
        Employee e3 = new Employee(103,"Vishesh",73250.25);
        Employee e4 = new Employee(104,"Dinesh",71234.25);

        pq.offer(e1);
        pq.offer(e2);
        pq.offer(e3);
        pq.offer(e4);

        pq.forEach(x -> System.out.println(x));
    }


//    private static void queuePriorityQOpr() {
//
//        Queue<Integer>q = new PriorityQueue<>();
//        q.add(20);
//        q.add(11);
//        q.add(40);
//        q.add(30);
//
//        System.out.println(q);
//        System.out.println("Peek element : "+q.peek());
//        System.out.println("Poll element "+q.poll());
//        System.out.println(q);
//        System.out.println("Remove Ellement "+q.remove());
//        System.out.println(q);
//
//        Iterator itr = q.iterator();
//        while (itr.hasNext()){
//            System.out.print(itr.next()+" ");
//        }
//
//
//    }
//
//    private static void queueLinkedListOpr() {
//
//        Queue<Integer>q = new LinkedList<>();
//        q.add(11);
//        q.add(20);
//        q.add(30);
//        q.add(40);
//
//        System.out.println(q);
//        System.out.println("Peek element : "+q.peek());
//        System.out.println("Poll element "+q.poll());
//        System.out.println(q);
//        System.out.println("Remove Ellement "+q.remove());
//        System.out.println(q);
//
//        Iterator itr = q.iterator();
//        while (itr.hasNext()){
//            System.out.print(itr.next()+" ");
//        }
//
//
//    }
}
