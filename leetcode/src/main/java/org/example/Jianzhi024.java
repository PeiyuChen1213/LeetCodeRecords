package org.example;

public class Jianzhi024 {
    public static void main(String[] args) {
        //测试git推送
        ListNode head = new ListNode(0);
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        head.next=first;
        first.next=second;
        second.next=third;

        ListNode listNode = reverseList(head);

        while (listNode!=null){
            System.out.println(listNode.val+"->");
            listNode=listNode.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }  
        //定义两个指针，一前一后，在原来的链表上进行操作
        ListNode pre = head;
        ListNode curr = head.next;
        ListNode temp;
        //将一开始的前一个指针指向空
        pre.next=null;
        while(curr!=null){
            //要修改curr的指向，这时先拷贝一份
            temp=curr.next;
            curr.next=pre;
            //更新指针的位置
            pre = curr;
            curr=temp;
        }
        return pre;
    }

}
