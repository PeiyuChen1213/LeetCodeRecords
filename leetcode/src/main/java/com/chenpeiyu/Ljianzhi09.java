package com.chenpeiyu;

public class Ljianzhi09 {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        cQueue.appendTail(3);
        cQueue.appendTail(4);

        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(1);
        System.out.println(cQueue.deleteHead());
    }
}
