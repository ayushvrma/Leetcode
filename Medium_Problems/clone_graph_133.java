package Medium_Problems;
import java.util.*;

public class clone_graph_133 {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Node head = new Node(node.val);
        HashMap<Integer, Node> map = new HashMap<>();
        map.put(head.val, head);
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node n = queue.pop();
            for(Node neighbor: n.neighbors){
                if(!map.containsKey(neighbor.val)){
                    map.put(neighbor.val, new Node(neighbor.val));
                    queue.add(neighbor);
                }
                map.get(n.val).neighbors.add(map.get(neighbor.val));
            }
        }
        return head;
    }
}
