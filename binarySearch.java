package Tree;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class binarySearch {

    public static boolean isValidBST(TreeNode root){

        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean valid(TreeNode node, long min, long max){

        if(node == null) return true;

        if(node.val<=min || node.val>=max) return false;

        return valid(node.left, min, node.val) &&
                valid(node.right, node.val, max);
    } 

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(12);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(6);



        System.out.println(isValidBST(root));

        TreeNode node = new TreeNode(5);

root.left = new TreeNode(3);
root.right = new TreeNode(7);

root.left.left = new TreeNode(2);
root.left.right = new TreeNode(4);

root.right.left = new TreeNode(6);
root.right.right = new TreeNode(8);

System.out.println(isValidBST(node));
    }
}
