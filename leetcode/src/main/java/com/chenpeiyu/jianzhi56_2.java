package com.chenpeiyu;

public class jianzhi56_2 {
    public static void main(String[] args) {

    }

    /**
     * 如果一个数字出现3次，它的二进制每一位也出现的3次。如果把所有的出现三次的数字的二进制表示的每一位都分别加起来，那么每一位都能被3整除。
     * 我们把数组中所有的数字的二进制表示的每一位都加起来。如果某一位能被3整除，那么这一位对只出现一次的那个数的这一肯定为0。
     * 如果某一位不能被3整除，那么只出现一次的那个数字的该位置一定为1
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums){
        int [] k = new int[32];
        for (int num : nums) {
            //从低位开始，将每一位都加起来
            for (int j = 0; j < 32; j++) {
                k[j] += (num >> j & 1) == 1 ? 1 : 0;
            }
        }
        int res = 0;
        for(int i = 31;i>=0;i--){
            //从高位开始一位一位比较
            res = res << 1;
            if(k[i]%3 == 1){
                //或上1的作用就是既可以保持原来的位的数字，但是又可以改变
                //想要改变的位
                res = (res | 1);
            }
        }
        return res;
    }
}
