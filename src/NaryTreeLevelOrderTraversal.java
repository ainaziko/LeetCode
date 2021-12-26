package December;

import java.util.ArrayList;
import java.util.List;

public class NaryTreeLevelOrderTraversal {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public void bfs(Node node, int level){
        if(levels.size() == level)
            levels.add(new ArrayList<Integer>());
        levels.get(level).add(node.val);

        for(int i = 0; i < node.children.size(); i++){
            bfs(node.children.get(i), level + 1);
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null) return levels;

        bfs(root, 0);
        return levels;
    }
}
