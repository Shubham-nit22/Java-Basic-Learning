package org.example.conditionalprog;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


abstract class Test{

    abstract void check(String s);

    public void run(){
        System.out.println("Running");
    }
}

public class JavaDay2 extends Test{

    public static void main(String[] args) {
        System.out.println("Welcome to Java Practice Day 2");

        JavaDay2 obj  = new JavaDay2();
        //Test t = new Test();
        obj.check(" : Abstract Class");

        //factorial();
        //electricityBill();

        //powerFunc();
        //cgpaCalCulation();

        //hcfAndLcmCal();
        //perfectNumber();

       // goingOutAug();
        //calculateLoopTime();
    }

//    private static void calculateLoopTime() {
//
//        ArrayList<Integer>list = new ArrayList<>();
//
//        long startTime;
//        long endTime;
//
//        startTime = Calendar.getInstance().getTimeInMillis();
//
//        for(int i=0;i<1000000;i++){
//            list.add(i);
//        }
//        endTime = Calendar.getInstance().getTimeInMillis();
//        System.out.println("Time to insert 1000000 values in list :"+(endTime-startTime)+" MS");
//
//        System.out.println("----------------------------------------------------------------------");
//
//        startTime = Calendar.getInstance().getTimeInMillis();
//        for(int a:list){
//            int i = a;
//        }
//        endTime = Calendar.getInstance().getTimeInMillis();
//        System.out.println("Time to reterive 1000000 values from list Using FOR EACH LOOP" +
//                ":"+(endTime-startTime)+" MS");
//        System.out.println("----------------------------------------------------------------------");
//
//
//        startTime = Calendar.getInstance().getTimeInMillis();
//        for(int i=0;i<1000000;i++){
//            int a = list.get(i);
//        }
//        endTime = Calendar.getInstance().getTimeInMillis();
//        System.out.println("Time to reterive 1000000 values from list Using FOR LOOP" +
//                ":"+(endTime-startTime)+" MS");
//        System.out.println("----------------------------------------------------------------------");
//
//
//        startTime = Calendar.getInstance().getTimeInMillis();
//        for(int i=0;i<list.size();i++){
//            int a = list.get(i);
//        }
//        endTime = Calendar.getInstance().getTimeInMillis();
//        System.out.println("Time to reterive 1000000 values from list Using FOR LOOP with LIST SIZE" +
//                ":"+(endTime-startTime)+" MS");
//        System.out.println("----------------------------------------------------------------------");
//
//
//        int size = list.size();
//        startTime = Calendar.getInstance().getTimeInMillis();
//        for(int i=0;i<size;i++){
//            int a = list.get(i);
//        }
//        endTime = Calendar.getInstance().getTimeInMillis();
//        System.out.println("Time to reterive 1000000 values from list Using FOR LOOP SIZE" +
//                ":"+(endTime-startTime)+" MS");
//        System.out.println("----------------------------------------------------------------------");
//
//
//        startTime = Calendar.getInstance().getTimeInMillis();
//        for(int i = list.size()-1;i>=0;i--){
//            int a = list.get(i);
//        }
//        endTime = Calendar.getInstance().getTimeInMillis();
//        System.out.println("Time to reterive 1000000 values from list Using REVERSE FOR LOOP SIZE" +
//                ":"+(endTime-startTime)+" MS");
//
//
//    }

    @Override
    void check(String s) {
        System.out.println("Inside Method Check of abstract class"+ s);
    }

//    private static void goingOutAug() {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter year ");
//
//        int year = scanner.nextInt();
//        System.out.println("Enter month of that year");
//        int month = scanner.nextInt();
//
//        YearMonth yearMonth = YearMonth.of(year,month);
//        int days = yearMonth.lengthOfMonth();
//
//        int count = 0;
//        for(int i=1;i<=days;i++){
//            if(i%2==0)
//                count++;
//        }

       // System.out.println("Number of days for which kunal can go out in auguest month is "+count);

    //}

//    private static void perfectNumber() {
//
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Enter Number to check perfect or not");
//        int num = scanner.nextInt();
//
//        int sum=0;
//        for(int i=1;i<=num/2;i++){
//            if(num%i==0)
//                sum+=i;
//        }
//
//        if(sum == num) System.out.println("Given Number is perfect number"+num);
//        else System.out.println("Not a perfect Number"+sum);
//    }

//    private static int hcf(int a,int b){
//        if(b == 0)
//            return a;
//
//        return hcf(b,a%b);
//    }
//
//    private static void hcfAndLcmCal() {
//
//        System.out.println("Enter two number for HCF and LCM calculation");
//        Scanner scanner = new Scanner(System.in);
//
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//
//        int hcfResult = hcf(num1,num2);
//
//        //since HCF*LCM = num1*num2
//        // LCM = (num1*num2)/HCF
//        //HCF = (num1*num2)/LCM
//
//        int lcm = (num1*num2)/hcfResult;
//
//        System.out.println("LCM of two numbers "+num1 + " And "+num2+" is : "+lcm);
//        System.out.println("HCF of two numbers "+num1+" And "+num2+" is : "+hcfResult);
//
//
//    }

//    private static void cgpaCalCulation() {
//
//        System.out.println("Enter Five Subject's obtain marks");
//        int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//        for(int i=0;i<5;i++){
//            int marks = scanner.nextInt();
//            sum+=marks;
//        }
//
//        int totalMarks = 500;
//        double cgpa = (sum*1.0/totalMarks)*100;
//
//        System.out.println("Obtained CGPA is : "+cgpa);
//
//    }

//    private static void powerFunc() {
//
//        Scanner scanner = new Scanner(System.in);
//        float number = scanner.nextFloat();
//        float powerv = scanner.nextFloat();
//
//        double result  = 1.0;
//        while(powerv > 0){
//            result*=number;
//            powerv--;
//        }
//
//        if(number != 0){
//            System.out.println(powerv+ " Power of "+number+" is : "+result);
//        }else
//        {
//            System.out.println("Power is "+0);
//        }
//    }

//    private static void factorial() {
//
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int num1 = num;
//
//        if(num < 0) System.out.println("Negetive number don't have factorial");
//        long total = 1;
//
//        while (num!= 0){
//            total*=num;
//            num--;
//        }
//        System.out.println("Factorial of Number : "+num1+ " is : "+total);
//    }

//    public static void electricityBill(){
//
//        Scanner scanner = new Scanner(System.in);
//        float numberOfUnit = scanner.nextFloat();
//        float pricePerUnit = scanner.nextFloat();
//
//        double totalBill = 0;
//        totalBill = numberOfUnit * pricePerUnit ;
//
//        System.out.println("Total Electricity Bill Amount is : "+totalBill);
//    }
//

}
