package org.example.stack;

import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {
        System.out.println("Welcome to Stack Learning");

        stackOpr();
    }

    private static void stackOpr() {

        Stack<Integer>stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        Stack stack1 = new Stack();
        stack1.push("Aman");
        stack1.push("Chaman");

        System.out.println("Stack 1 : \n"+stack);
        System.out.println("Stack 2 : \n "+stack1);

        System.out.println("Peak of Stack 1 : "+stack.peek());
        System.out.println("Peak of Stack 2:"+stack1.peek());

        System.out.println("Stack 1 : \n"+stack);
        System.out.println("Stack 2 : \n "+stack1);

        System.out.println(stack.pop());
        System.out.println(stack1.pop());

        System.out.println("Stack 1 : \n"+stack);
        System.out.println("Stack 2 : \n "+stack1);




    }
}
