package org.example.arrays;

import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;


class Student{

    String name;
    int rollno;
    double cgpa;

    Student(String name,int rollno,double cgpa){
        this.name = name;
        this.rollno = rollno;
        this.cgpa = cgpa;
    }


}




public class JavaDay3 {

    public static void main(String[] args) {

       // arrayIntialization();
        //arrayAsObject();
        multiArray();
    }

    private static void multiArray() {

        int[][] arr1 = new int[3][3];
        arr1[0][0] = 1; arr1[0][1] = 2; arr1[0][2] = 3;
        arr1[1][0] = 4; arr1[1][1] = 5;arr1[1][2] = 6;
        arr1[2][0] = 7;arr1[2][1] = 8;arr1[2][2] = 9;

        double[][] arr2 = {{1.1,1.2}, {2.1,2.2}};

        String[][] str = new String[2][3];

        System.out.println("Enter User String for 2_D array");

        Scanner scanner =new Scanner(System.in);
        for(int i=0;i< str.length;i++){
            for (int j=0;j<3;j++){
                String s = scanner.nextLine();
                str[i][j] = s;
            }
        }

        for (int[] i : arr1){
            for (int j : i){
                System.out.print(j+" ");
            }
            System.out.println("\n");
        }

        for(double[] d : arr2){
            for (double d1 : d){
                System.out.print(d1+" ");
            }
            System.out.println("\n");
        }

        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length;j++){
                System.out.print(str[i][j]+ " ");
            }
            System.out.println("\n");
        }


    }

//    private static void arrayAsObject() {
//
//        Student[] std = new Student[5];
//        std[0] = new Student("Aman",101,8.4);
//        std[1] = new Student("Chaman",102,8.4);
//        std[2] = new Student("Daman",103,8.4);
//        std[3] = new Student("Raman",104,8.4);
//        std[4] = new Student("Baman",105,8.4);
//
//        for(Student s : std){
//            System.out.println(s.name+" : "+s.rollno+" : "+s.cgpa);
//        }
//        System.out.println("--------------------------------------------------");
//
//        Student[] s = {
//                        new Student("Aman",501,8.7),
//                        new Student("Prakash",501,8.7) ,
//                        new Student("Vishwash",501,8.7)
//                        }  ;
//        for(int i=0;i<s.length;i++){
//            System.out.println(s[i].name+" : "+s[i].rollno+" "+s[i].cgpa);
//        }
//
//
//
//    }

//    private static void arrayIntialization() {
//
//        int arr[] = new int[5];
//        double[] arr2 = {1.1,2.2,3.3,4.4,5.5};
//        float[] arr3 = new float[5];
//        arr3[0] = 1.4f;
//        arr3[1] = 2.4f;
//        arr3[2] = 3.4f;
//        arr3[3] = 4.4f;
//        arr3[4] = 5.4f;
//
//        for(int i=0;i<arr.length;i++){
//            arr[i] = i+1;
//        }
//
//        int[] arr4 = IntStream.range(10,15).toArray();
//        int arr5[] = IntStream.rangeClosed(15,20).toArray();
//
//        System.out.println("Array ONE (arr)");
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println("\n --------------------------------------------");
//
//
//        for (double a : arr2){
//            System.out.print(a);
//        }
//        System.out.println("\n --------------------------------------------");
//
//        for (float f:arr3){
//            System.out.print(f);
//        }
//        System.out.println("\n --------------------------------------------");
//
//        for(int a: arr4){
//            System.out.print(a);
//        }
//        System.out.println("\n --------------------------------------------");
//
//        for(int i=0;i<arr5.length;i++){
//            System.out.print(arr5[i]);
//        }
//
//    }
}
