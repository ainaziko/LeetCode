package December;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NaryTreePostorderTraversal {

    public List<Integer> postorder(Node root) {
        List<Integer> list=new ArrayList<>();
        postOrder(root,list);
        return list;
    }
    public void postOrder(Node root,List<Integer> list) {
        if(root==null)return;
        for(int i=0;i<root.children.size();i++)
            postOrder(root.children.get(i),list);
        list.add(root.val);
    }




    public List<Integer> postorderS(Node root) {
        LinkedList<Integer> output = new LinkedList<>();
        LinkedList<Node> stack = new LinkedList<>();
        if(root == null){
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()){
            Node node = stack.pollLast();
            output.addFirst(node.val);

            for(Node n : node.children){
                if(n != null){
                    stack.add(n);
                }
            }
        }
        return output;
    }

}
