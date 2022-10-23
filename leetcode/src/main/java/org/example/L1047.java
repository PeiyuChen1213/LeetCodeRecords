package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class L1047 {
    public static void main(String[] args) {
        String s= "abbaca";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s){

        //典型得用栈消消乐
        char[] charArray = s.toCharArray();
        //辅助栈得定义
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : charArray) {
            //如果栈为空，直接push
            if (stack.isEmpty()){
                stack.push(c);
            }else {
                char pop=stack.pop();
                //出现重复元素
                if (pop!=c){
                    //将取出得元素还回去
                    stack.push(pop);
                    //将现在得元素push进去
                    stack.push(c);
                }
            }
        }
        StringBuilder res= new StringBuilder();
        for (Character character : stack) {
            res.insert(0,character);
        }
        return res.toString();
    }
}
