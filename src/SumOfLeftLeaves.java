package December;

import java.util.List;

public class SumOfLeftLeaves {
    public void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.left);

        dfs(node.right);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return 1;
    }
}
