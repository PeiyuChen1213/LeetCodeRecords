package com.chenpeiyu;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 带有min函数的栈
 */
public class MinStack {

    /**
     * initialize your data structure here.
     */

    //只用一个栈来解决
    private Deque<Integer> stack;

    private Integer min;

    public MinStack() {
        stack = new ArrayDeque<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x <= min) {
            min = x;
        }
        //先放入最小值再 放入值
        stack.push(min);
        stack.push(x);
    }

    public void pop() {
        //第一次pop 弹出实际存入的数
        stack.pop();
        //第二次弹出弹出的是对应的最小值
        stack.pop();
        if (!stack.isEmpty()) {
            //修改此时的最小值
            int temp = stack.pop();
            min = stack.pop();
            //再将 最小值和存入的值放回栈当中
            stack.push(min);
            stack.push(temp);
        }else {
            //如果此时的栈已经空了 清空最小值恢复到原来的
            min=Integer.MAX_VALUE;
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }

//    /** initialize your data structure here. */
//    //两个栈一个用于正常存储栈的元素，一个存储最小值
//    private Deque<Integer> stack;
//    private Deque<Integer> minStack;
//    public MinStack() {
//        stack=new ArrayDeque<>();
//        minStack=new ArrayDeque<>();
//        minStack.push(Integer.MAX_VALUE);
//    }
//
//    public void push(int x) {
//        //最小值是储存在栈顶的
//        stack.push(x);
//        minStack.push(Integer.min(x,minStack.peek()));
//    }
//
//    public void pop() {
//        //两个栈都要pop一次
//        stack.pop();
//        minStack.pop();
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int min() {
//        return minStack.peek();
//    }
}
