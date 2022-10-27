package com.chenpeiyu;

import java.util.Stack;

public class Jianzhi031 {


    public static void main(String[] args) {

    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed == null || pushed.length <= 0){
            return true;
        }
        int k = 0;
        Stack<Integer> stack = new Stack();
        for(int i = 0; i < pushed.length; i++){
            //开始往里面压栈
            stack.push(pushed[i]);
            //开始判断，只要判断pop队列当中的头元素就行
            while(!stack.isEmpty() && stack.peek() == popped[k]){
                stack.pop();
                k++;
            }
        }
        return stack.isEmpty();
    }
}
