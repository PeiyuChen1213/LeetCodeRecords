package com.chenpeiyu;

public class L019 {
    public static void main(String[] args) {

    }
    public static ListNode remove(ListNode head,int n){
        //链表操作可以使用一个比较省心的方式去解决，就是虚拟节点的方式
        //创建一个虚拟头节点去指向这个元素
        ListNode dummy = new ListNode(-1,head);

        //定义两个指针
        ListNode fast = dummy;
        ListNode slow = dummy;

        //将快指针提前先移动n+1步，然后快慢指针再同时移动，
        //这样当快指针到达null的位置是，慢指针就可以到达需要删除的节点的前一个节点

        for (int i = 0; i < n+1; i++) {
            fast=fast.next;
        }
        //然后快慢指针再同时移动
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //此时slow指针已经到达待删除节点的前一个元素
        slow.next=slow.next.next;
        return dummy.next;
    }
}
