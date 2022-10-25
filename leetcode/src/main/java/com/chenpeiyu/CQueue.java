package com.chenpeiyu;

import java.util.ArrayDeque;
import java.util.Deque;

public class CQueue {
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    public CQueue() {
        this.stack1 = new ArrayDeque<>();
        this.stack2 = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        //给栈添加一个元素
        stack1.push(value);
    }

    public int deleteHead() {
        //根据栈的特性，再次放到一个新的栈当中，再把栈顶pop就可以达到效果

        //当队列中的元素都没有的情况下
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }
        //当栈1有元素，但是栈2是空的情况下
        if (stack2.isEmpty()) {
            //将栈1所有的元素加入到栈2 然后输出栈2的顶部
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            //然后返回栈2的顶部
            return stack2.pop();
        } else {
            //当栈2 还有元素的情况下，直接返回栈2的顶部
            return stack2.pop();
        }
    }
}
