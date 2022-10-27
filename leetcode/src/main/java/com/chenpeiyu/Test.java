package com.chenpeiyu;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);


        minStack.top();
    }
}
