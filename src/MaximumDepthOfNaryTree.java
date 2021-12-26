package December;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MaximumDepthOfNaryTree {

    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }else if(root.children.isEmpty()){
            return 1;
        }else {
            List<Integer> heights = new LinkedList<>();
            for(Node node : root.children){
                heights.add(maxDepth(node));
            }
            return 1 + Collections.max(heights);
        }
    }
}
