package com.chenpeiyu;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Jianzhi055 {
    public static void main(String[] args) {

    }


    /**
     * 深度优先搜索
     * @param root
     * @return
     */

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }


    /**
     * 层序遍历 广度优先搜索
     * @param root
     * @return
     */
    public static int maxDepth2(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int res = 0;
        while (!queue.isEmpty()) {
            res++;
            int n = queue.size();

            //每一层的节点都遍历一次，并且从队列中取出，当到达最后一层的时候，队列的元素不会再新增，所以此时就可以结束循环
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return res;
    }

}
