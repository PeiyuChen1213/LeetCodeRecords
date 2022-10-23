package org.example;

public class L024 {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {
        //用一个表记录每个字母出现的次数
        int[] records = new int[26];
        for (int i = 0; i < s.length(); i++) {
            records[(int) (s.charAt(i) - 'a')]++;
        }
        //消消乐。如果出现过次数就减掉1
        for (int i = 0; i < t.length(); i++) {
            records[(int) (t.charAt(i) - 'a')]--;
        }

        //最后的判断
        for (int i = 0; i < records.length; i++) {
            if (records[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
