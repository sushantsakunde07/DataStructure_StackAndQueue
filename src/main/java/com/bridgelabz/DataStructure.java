package com.bridgelabz;

public class DataStructure {
    public static void main(String[]args) {
        System.out.println("Welcome message on the master branch");
        createStack();
    }

    private static void createStack() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.myLinkedList.printMyNode();
    }
}