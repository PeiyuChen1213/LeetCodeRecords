package com.chenpeiyu;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<Integer>(); //主队列
        queue2 = new LinkedList<Integer>();//辅助队列
    }

    public void push(int x) {
        queue2.offer(x);
        //为了实现栈的先进后出的原则，添加的基本思路就是将主队列中原来的元素放在辅助队列当中，这样原来先进的元素在辅助队列中就是后进的
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        //将辅助队列和主队列叫唤一下
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}