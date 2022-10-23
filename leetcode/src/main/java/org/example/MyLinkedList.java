package org.example;

/**
 * 开始设计链表
 */
public class MyLinkedList {
    //链表的长度
    private int size;
    //定义一个头节点
    private ListNode head;

    //初始化链表
    public MyLinkedList() {
        this.size = 0;
        this.head = null;
    }

    public void addAtHead(int val){
        //创建一个新节点
        ListNode newHead = new ListNode(val);
        // 将新节点加入到链表的头节点当中去
        newHead.next=head;
        head=newHead;
        size++;
    }
    public void addAtTail(int val){
        //根据传入的值创建一个新节点
        ListNode newNode = new ListNode(val,null);
        ListNode curr = head;
        if (curr==null){
            //如果是第一次尾插的话，再插入的值就是头节点
            head=newNode;
        }else {
            while (curr.next!=null){
                curr=curr.next;
            }
            //通过上述循环找到最后一个元素
            curr.next=newNode;
        }
        size++;
    }

    public int get(int index){
        ListNode curr = head;
        if (size==0){
            throw new RuntimeException("链表为空");
        }
        //对index的值进行健壮性判断
        if (index<0||index>=size){
           throw  new RuntimeException("输入的数据不合法");
        }else {
            for (int i = 0; i < index; i++) {
                curr=curr.next;
            }
        }
        //找到对应下标的元素之后 直接返回
        return curr.val;
    }

    public void addAtIndex(int pos,int val){
        //先进行一次健壮性判断
        if (pos>size){
            throw new RuntimeException("输入的数据不合法");
        }
        if (pos==0){
            addAtHead(val);
        }else if (pos==size){
            addAtTail(val);
        }else {
            ListNode newNode = new ListNode(val);
            //插入首尾两个方式已经处理完成了
            //开始正常插入
            //开始找到前插入位置的前一个元素
            ListNode pre = head;
            for (int i = 1; i < pos; i++) {
                pre=pre.next;
            }
            //找到后开始插入
            ListNode temp=pre.next;
            pre.next=newNode;
            newNode.next=temp;
            size++;
        }
    }

    public void deleteAtIndex(int pos){
        if (pos<0||pos>=size){
            throw new RuntimeException("输入的数据不合法");
        }
        if (pos==0){
            //删除第一个位置的元素，就是直接覆盖
            head=head.next;
        }else {
            //开始找插入位置的前一个元素
            ListNode pre = head;
            for (int i = 1; i < pos; i++) {
                pre=pre.next;
            }
            pre.next=pre.next.next;
        }
        size--;
    }

    //展示链表用于做测试
    public void display(){
        if (size==0){
            System.out.println("链表为空的");
        }else {
            ListNode curr=head;
            while (curr!=null){
                System.out.print(curr.val+"->");
                curr=curr.next;
            }
        }
    }


    //获取链表的长度
    public int size(){
        return size;
    }


}