package Tree;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SmallestElement {

    List<Integer> ans=new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return ans.get(k - 1);
    }

    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }
    public static void main(String[] args) {

    TreeNode root = new TreeNode(5);

    root.left = new TreeNode(3);
    root.right = new TreeNode(6);

    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);

    root.left.left.left = new TreeNode(1);

    int k = 3;

    SmallestElement obj = new SmallestElement();

    System.out.println("The " + k + "rd smallest element is: "
            + obj.kthSmallest(root, k));

    }
}
