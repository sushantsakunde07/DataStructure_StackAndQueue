package com.bridgelabz;

public class MyStack {
    MyLinkedList myLinkedList = new MyLinkedList();

    public void push(INode myNode){
        myLinkedList.add(myNode);
    }

    public INode peek(){
        return myLinkedList.head;
    }

    public INode pop(){
        return myLinkedList.pop();
    }
}