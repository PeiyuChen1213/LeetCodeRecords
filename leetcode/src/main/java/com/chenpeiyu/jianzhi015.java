package com.chenpeiyu;

/**
 * 查找关于二进制数当中的1的数目
 */
public class jianzhi015 {
    public static void main(String[] args) {

    }

    public static int hammingWeight(int n) {
        //位运算公式的应用 n& (n-1) 得到的结果是去掉最右侧的1
        //比如n=1001 相与之后就是1000 ，1010 相与之后就是1000

        //所以我们只要在所有的1被与完之前统计与操作的次数就行
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
