package com.bridgelabz;

public class MyStack {
    MyLinkedList myLinkedList = new MyLinkedList();

    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }
}