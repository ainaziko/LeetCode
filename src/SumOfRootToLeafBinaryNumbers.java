package December;

public class SumOfRootToLeafBinaryNumbers {
    int sum = 0;

    public void preorder(TreeNode node, int currNum){
        if(node != null){
            currNum = (currNum << 1) | node.val;
            if(node.left == null && node.right == null){
                sum += currNum;
            }
            preorder(node.left, currNum);
            preorder(node.right, currNum);
        }
    }
    public int sumRootToLeaf(TreeNode root) {
        preorder(root, 0);
        return sum;
    }
}
