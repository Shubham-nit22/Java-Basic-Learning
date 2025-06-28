package org.example.flowOfProgramm;

import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {

        System.out.println("Welcome to Java revision...");
        //evenOrOdd();
        //greetingMessage();
        //simpleInterest();
        //calculateValue();
        //largestNumber();
        //checkInput();
        //palindrom();
        //armstrongNumber();
    }

//    private static void armstrongNumber() {
//
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int original = num;
//
//        int len = String.valueOf(num).length();
//
//        int total = 0;
//
//        while(num!=0){
//            int last = num%10;
//            total+= (int) Math.pow(last,len);
//            num/=10;
//        }
//
//        if(total == original) System.out.println("Given Number is Armstrong Number..."+total);
//        else System.out.println("Given Number is Not Armstrong Number");
//
//
//    }
//
////    private static void palindrom() {
////
////        Scanner scanner = new Scanner(System.in);
////        String str = scanner.nextLine();
////
////        if(str.length()%2 == 0){
////            int i = 0;
////            int j = str.length()-1;
////
////            while (i < j){
////                if(str.charAt(i)!= str.charAt(j)){
////                    System.out.println("String is not palindrom ");
////                    break;
////                }
////                i++;
////                j--;
////            }
////            if(i>j)
////                System.out.println("Given String is Palindrome "+str);
////        }else {
////            int i = 0;
////            int j = str.length()-1;
////
////            while (i != j){
////                if(str.charAt(i)!= str.charAt(j)){
////                    System.out.println("String is not palindrom ");
////                    break;
////                }
////                i++;
////                j--;
////            }
////            if(i == j)
////                System.out.println("Given String is Palindrome "+str);
////        }
////
////
////    }
//
////    private static void checkInput() {
////        Scanner scanner = new Scanner(System.in);
////
////        int num1 = scanner.nextInt();
////        System.out.println(num1);
////        String name = scanner.nextLine();
////        System.out.println(name);
////        String name2 = scanner.nextLine();
////        System.out.println(name2);
////        int num2 = scanner.nextInt();
////        System.out.println(num2);
////        scanner.nextLine();
////        String name3 = scanner.nextLine();
////        System.out.println(name3);
////
////    }
//
////    private static void largestNumber() {
////
////
////        Scanner scanner = new Scanner(System.in);
////        int num1 = scanner.nextInt();
////        int num2 = scanner.nextInt();
////
////        if(num1 > num2)
////            System.out.println("Number1 "+num1 + " is greate than "+num2);
////        else System.out.println("Numbr2 "+num2 + " is greater than "+num1);
////    }
//
////    private static void calculateValue() {
////
////        System.out.println("Enter Operator and two numbers");
////        Scanner scanner = new Scanner(System.in);
////
////        char opr = scanner.nextLine().charAt(0);
////        int num1 = scanner.nextInt();
////        int num2 = scanner.nextInt();
////
////        if(opr == '+')
////            System.out.println("Addition of "+num1+ " And "+num2 +" is : "+(int)(num1+num2));
////        else if(opr == '-')
////            System.out.println("Subtraction of "+num1+ " And "+num2 +" is : "+(int)(num1-num2));
////        else if(opr == '*')
////            System.out.println("Addition of "+num1+ " And "+num2 +" is : "+ num1*num2);
////        else
////            System.out.println("Addition of "+num1+ " And "+num2 +" is : "+ num1/num2);
////
////
////
////    }
//
////    public static void evenOrOdd(){
////
////        Scanner scanner = new Scanner(System.in);
////        int num = scanner.nextInt();
////
////       // Integer num1 = Integer.parseInt(scanner.nextLine());
////
////
////        if(num%2 == 0){
////            System.out.println("Number is even ");
////        }else{
////            System.out.println("Number is odd");
////        }
////    }
//
////    public static void greetingMessage(){
////
////        Scanner scanner = new Scanner(System.in);
////        String name = scanner.nextLine();
////
////        System.out.println(" Hello "+name+" Welcome to Java Learning");
////
////    }
//
////    public static void simpleInterest(){
////
////        System.out.println("Enter Principle,Interest Rate and Time ");
////        Scanner scanner = new Scanner(System.in);
////
////        double principal = scanner.nextDouble();
////        float rate = scanner.nextFloat();
////        float time = scanner.nextFloat();
////
////        double si = (principal*rate*time)/100.0 ;
////
////        System.out.println("Simple interest of principal "+principal + " is : "+si);
////
////    }





}
