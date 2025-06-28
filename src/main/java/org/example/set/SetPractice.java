package org.example.set;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {
        System.out.println("Welcome to set practice");

       // setOpr();
        //hashSetOpr();
        //treeSetOpr();
       // linkedHashSet();
        listToSet();
    }

    private static void listToSet(){

        List<String>list = ArrayList.asList("first","second","third","fourth","first","third");

        list.stream().collect(Collectors.toSet(LinkedHashSet::new));
    }

//    private static void linkedHashSet() {
//
//        LinkedHashSet<String>list = new LinkedHashSet<>();
//        list.add("First");
//        list.add("Second");
//        list.add("Third");
//        list.add("Fourth");
//        list.add("First");
//        list.add(null);
//        list.add(null);
//
//        System.out.println(list);
//    }

//    private static void treeSetOpr() {
//
//        TreeSet<String>set = new TreeSet<>();
//        set.add("Rupa");
//        set.add("Pushpa");
//        set.add("Macho");
//        set.add("Lux");
//        //set.add(null);
//        //set.add(null);
//        set.add("Macho");
//        System.out.println(set);
//
//        System.out.println("Set contains element 'Rupa' : "+set.contains("Rupa"));
//        System.out.println("First Element : "+set.first());
//        System.out.println("Last Element : "+set.last());
//        System.out.println("Element after 'Macho' : "+set.higher("Macho"));
//        System.out.println("Element Before 'Macho' : "+set.lower("Macho"));
//
//
//
//        TreeSet<String>set1 = new TreeSet<>();
//    }

//    private static void hashSetOpr() {
//
//        Set<Integer>set = new HashSet<>();
//
//        set.add(10);
//        set.add(15);
//        set.addAll(Arrays.asList(10,15,20));
//        for(int i : set){
//            System.out.println(i);
//        }
//
//        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(87, 15, 67));
//
//        set.remove(20);
//        set.removeAll(set1);
//
//        System.out.println(set);
//    }

//    private static void setOpr() {
//
//        Set<Integer>set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//
//        Iterator<Integer>itr = set.iterator();
//        while (itr.hasNext()){
//            System.out.print(itr.next()+" : ");
//        }
//        System.out.println("\n");
//
//        set.addAll(Arrays.asList(new Integer[]{8,7,6}));
//        itr = set.iterator();
//        while (itr.hasNext()){
//            System.out.print(itr.next()+" : ");
//        }
//        System.out.println("\n");
//
//        Set<Integer>set1 = new HashSet<>();
//        set1.add(3);set1.add(7);set1.add(8);set1.add(1);
//
//        itr = set1.iterator();
//        while (itr.hasNext()){
//            System.out.print(itr.next()+" : ");
//        }
//        System.out.println("\n");
//
//
//        System.out.println("Union Operation on set1 and set2");
//        Set<Integer>union = new HashSet<>(set);
//        union.addAll(set1);
//
//        System.out.println("Union is "+union);
//
//        System.out.println("InterSection On Set1 and Set2 ");
//        Set<Integer>intersection = new HashSet<>(set);
//        intersection.retainAll(set1);
//        System.out.println("Intersection is "+intersection);
//
//        System.out.println("Symmetric difference ");
//        Set<Integer>diffrence = new HashSet<>(set);
//        diffrence.removeAll(set1);
//        System.out.println("Symmetric difference "+ diffrence);
//
//    }

    
}
