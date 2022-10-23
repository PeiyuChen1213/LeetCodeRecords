package org.example;

import java.util.Stack;

public class L020 {

    public static void main(String[] args) {

    }

    public static boolean isValid(String s){
        Stack<Character> stack= new Stack<>();
        //先遍历每个元素
        for (int i = 0; i <s.length() ; i++) {
            char eachChar=s.charAt(i);
            //如果是左括号直接放到栈里面
            if (eachChar=='{'||eachChar=='('||eachChar=='['){
                stack.push(eachChar);
            }else {
                //如果是右括号，并且栈不为空
                if (!stack.isEmpty()){
                    if (eachChar=='('){
                        if (stack.pop()!=')'){
                            return false;
                        }
                    }else if (eachChar=='{'){
                        if (stack.pop()!='}'){
                            return false;
                        }
                    } else if (eachChar=='['){
                        if (stack.pop()!=']'){
                            return false;
                        }
                    }
                }else { //如果右括号进来栈还是空得，则直接返回false
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
