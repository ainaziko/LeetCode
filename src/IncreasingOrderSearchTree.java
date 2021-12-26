package December;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inorder(root, values);
        TreeNode ans = new TreeNode(0), curr = ans;

        for(int i : values){
            curr.right = new TreeNode(i);
            curr = curr.right;
        }
        return ans.right;
    }

    public void inorder(TreeNode node, List<Integer> values){
        if(node == null)
            return;

        inorder(node.left, values);
        values.add(node.val);
        inorder(node.right, values);
    }
}
