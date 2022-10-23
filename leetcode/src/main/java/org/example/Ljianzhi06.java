package org.example;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Ljianzhi06 {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next=new ListNode(1);
        head.next.next= new ListNode(2);
        head.next.next.next = new ListNode(3);
        System.out.println(Arrays.toString(reversePrime(head)));
    }

    public static int[] reversePrime(ListNode head){
//        //利用栈的特性解决这个问题
//        Deque<Integer> integerDeque = new ArrayDeque<>();
//
//        //开始遍历链表，将链表的值全部放到栈当中去
//        while (head!=null){
//            integerDeque.push(head.val);
//            head=head.next;
//        }
//
//        int[] res = new int[integerDeque.size()];
//        int index = 0;
//        while (!integerDeque.isEmpty()){
//            res[index]=integerDeque.pop();
//            index++;
//        }
//        return res;


        //不用栈，让数组倒序来存储数据
        //为了确定开辟的数组大小，遍历的时候需要记录数组的长度
        int count = 0;
        ListNode temp = head;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        int[] res = new int[count];

        //逆序遍历数组将数组存入
        int index = count-1;
        while (head!=null){
            res[index]= head.val;
            head=head.next;
            index--;
        }
        return res;
    }
}
