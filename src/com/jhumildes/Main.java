package com.jhumildes;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Bia","Linda", 3452));
        stack.push(new Employee("Wivi","Bento", 5467));
        stack.push(new Employee("Jake","Young",4563));
        stack.push(new Employee("Dora","Licia",6584));

        //stack.printStack();
        System.out.println(stack.peek());
       // stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());
    }
}
