package com.chenpeiyu;

public class jianzhi016 {
    public static void main(String[] args) {
        System.out.println(mypow(3, 13));
    }

    public static double mypow(double x, int n) {
        double res = 1;
        long y = n;

        if (n < 0){
            //把负整数的指数幂转化成分数的正整数指数幂
            x=1/x;
            y=-y;
        }

        //如果指数是正数的话
        while (y > 0) {
            if (y % 2 == 1) {
                //如果右移之后是奇数的话还是在执行这个操作
                res = res * x;
            }
            x=x*x; //循环每次都计算这个 但是如果是偶数的话这个的值不会被加上

            //右移一位
            y=y/2;
        }

        return res;
    }
}
