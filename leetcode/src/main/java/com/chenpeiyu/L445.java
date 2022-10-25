package com.chenpeiyu;

public class L445 {


    public static void main(String[] args) {



    }

    public static ListNode twoSumOfList(ListNode l1, ListNode l2){
        //先将两个链表进行反转，然后低位相加 处理进位关系
        ListNode reverseList1 = reverseList(l1);
        ListNode reverseList2 = reverseList(l2);

        //设置一个虚拟节点
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        //然后开始相加

        //设置一个进位符号
        int carry = 0;
        while (reverseList1!=null||reverseList2!=null){
            int n1 = reverseList1==null?0:reverseList1.val;
            int n2 = reverseList2==null?0:reverseList2.val;
            int sum= n1+n2+carry;
            curr.next=new ListNode(sum%10);
            carry=sum/10;
            reverseList1=reverseList1==null?null:reverseList1.next;
            reverseList2=reverseList2==null?null:reverseList2.next;
            curr=curr.next;
        }
        // 如果上述循环结束后还有进位 则说明是高位进位

        if (carry==1){
            curr.next=new ListNode(1);
        }

        return reverseList(dummy.next);
    }



    public static ListNode reverseList(ListNode head) {
        //利用双指针法解决这个问题
        //初始化两个指针
        ListNode pre = null;
        ListNode curr = head;
        ListNode temp = null;

        while (curr != null) {
            // curr->next的值要被改变所以需要有一个临时变量来储存这个元素
            temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }
}
