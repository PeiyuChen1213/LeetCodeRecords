package org.example;

public class L541 {
    public static void main(String[] args) {

    }

    public static String reverseStr(String s, int k) {
        //先将字符串转化为字符数组
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i += 2 * k) {
            //进行判断，如果尾数不够k个，就全部反转
            int left = i;
            int right = Math.min(str.length - 1, left + k - 1);

            while (left < right) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }
        return new String(str);
    }
}
