package com.chenpeiyu;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 带有min函数的栈
 */
public class MinStack {

    /** initialize your data structure here. */

    //只用一个栈来解决
    private Deque<Integer> stack;

    private Integer min;
    public MinStack() {
        stack = new ArrayDeque<>();
        min=Integer.MAX_VALUE;
    }

    public void push(int x) {
        //先放元素，再放入最小值
        stack.push(x);
        if (x<=min){
            min=x;
        }
        //再直接放入到最小值
        stack.push(min);
    }

    public void pop() {
        //第一次pop是弹出存入的值
        stack.pop();
        //第二次弹出弹出的是对应的最小值
        stack.pop();
    }

    public int top() {

    }

    public int min() {

    }
}
