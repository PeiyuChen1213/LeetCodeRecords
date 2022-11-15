package com.chenpeiyu;

public class BitOp {
    public static void main(String[] args) {
        int res = pow(3,13);
    }
    public static int pow(int n,int m){
        int sum = 1;
        int temp = m;
        while (n!=0){
            if ((n & 1)==1){
                sum*=temp;
            }
            temp*=temp;
            n=n >> 1;
        }
        return sum;
    }
}
