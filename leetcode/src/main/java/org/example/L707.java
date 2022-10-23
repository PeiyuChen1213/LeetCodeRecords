package org.example;


/**
 * leetcode设计链表的题目进行一个测试
 */
public class L707 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(3);
        list.addAtTail(4);
        list.addAtTail(5);
        list.addAtTail(6);
        list.addAtIndex(2,3);
        list.deleteAtIndex(0);
        list.deleteAtIndex(0);
        list.deleteAtIndex(0);
        list.deleteAtIndex(0);
        list.deleteAtIndex(0);
        list.deleteAtIndex(0);
        list.display();
        System.out.println();
        System.out.println(list.size());
    }
}
