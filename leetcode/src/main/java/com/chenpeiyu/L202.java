package com.chenpeiyu;

import java.util.HashSet;
import java.util.Set;

public class L202 {
    public static void main(String[] args) {
        System.out.println(getSquare(201));
    }
    public static boolean isHappy(int num){
        //采取循环验证加上hash table的方式解决这个问题
        Set<Integer> res = new HashSet<>();
        while (num!=1||!res.contains(num)){
            //将获得的值全部加入到hash table当中
            res.add(num);
             num = getSquare(num);
        }
        return num==1;
    }


    public static int getSquare(int n){
        //获取各个位数的平方和
        int sum=0;
        while (n!=0){
            sum+=Math.pow(n%10,2);
            n/=10;
        }
        return sum;
    }
}
