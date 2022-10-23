package org.example;

public class Ljianzhi58 {
    public static void main(String[] args) {
        System.out.println(leftReverse("lrloseumgh",6));
    }
    public static String leftReverse(String s,int k){
        if (k>s.length()){
            return null;
        }
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < k; i++) {
            sb.append(sb.charAt(i));
        }
        //删除掉前k个元素
        sb.delete(0,k);
        return sb.toString();
    }
}
