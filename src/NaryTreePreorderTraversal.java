package December;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        nPreorder(root, list);
        return list;
    }

    public void nPreorder(Node node, List<Integer> list){
        if(node == null) return;

        list.add(node.val);
        for(int i = 0; i < node.children.size(); i++){
            nPreorder(node.children.get(i), list);
        }
    }
}
