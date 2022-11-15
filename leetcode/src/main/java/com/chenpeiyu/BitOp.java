package com.chenpeiyu;

public class BitOp {
    public static void main(String[] args) {
        int res = pow(13, 3);
        System.out.println(res);

        System.out.println(findN(19));

    }

    public static int pow(int n, int m) {
        int sum = 1;
        int temp = m;
        while (n != 0) {
            if ((n & 1) == 1) {
                sum *= temp;
            }
            temp *= temp;
            n = n >> 1;
        }
        return sum;
    }


    public static int findN(int n) {
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;// 整型一般是 32 位，上面我是假设 8 位。
        return (n + 1) >> 1;
    }
}
