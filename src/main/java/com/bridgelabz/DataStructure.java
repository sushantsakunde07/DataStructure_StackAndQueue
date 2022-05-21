package com.bridgelabz;

import java.util.Scanner;

public class DataStructure {
    public static void main(String[] args) {
        System.out.println("Welcome message on the master branch");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press '1' to add element at the start");
        System.out.println("Press '2' to peek the element");
        System.out.println("Press '3' to pop the element");
        switch (sc.nextInt()) {
            case 1:
                createStack();
                break;
            case 2:
                peakTheNode();
                break;

            case 3:
                pop();
                break;
            default:
                System.out.println("Press Valid Key");
        }
    }

    private static void pop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.myLinkedList.printMyNode();
        myStack.pop();
        myStack.myLinkedList.printMyNode();

    }

    private static void peakTheNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.myLinkedList.printMyNode();
        myStack.peek();
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