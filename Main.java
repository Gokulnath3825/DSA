package Tree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Main {

    static List<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,6,7};

        TreeNode[] nodes = new TreeNode[arr.length];

        // Create Nodes
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                nodes[i] = new TreeNode(arr[i]);
            }
        }
        // Connect Nodes
        for (int i = 0; i < arr.length; i++) {

            if (nodes[i] != null) {

                int left = 2 * i + 1;
                int right = 2 * i + 2;

                if (left < arr.length)
                    nodes[i].left = nodes[left];

                if (right < arr.length)
                    nodes[i].right = nodes[right];
            }
        }

        TreeNode root = nodes[0];

        System.out.println(postOrder(root));
    }

    public static List<Integer> postOrder(TreeNode root) {
        int count=0;
        if (root == null)
            return ans;

        postOrder(root.left);
        postOrder(root.right);

        ans.add(count+1);

        return ans;
    }
}