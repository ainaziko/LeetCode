package December;

public class RangeSumOfBST {
    int sum = 0;

    public void helper(TreeNode node, int low, int high){
        if(node == null) return;
        if(node.val >= low && node.val <= high){
            sum += node.val;
        }
        helper(node.left, low, high);
        helper(node.right, low, high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null)
            return sum;
        helper(root, low, high);
        return sum;
    }
}
