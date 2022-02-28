package Easy_Problems;
import java.util.*;
public class path_exists_1971 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        HashSet<Integer> visited = new HashSet<Integer>();
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            if (map.containsKey(a)) {
                ArrayList<Integer> t = map.get(a);
                t.add(b);
                map.put(a, t);
            } else {
                ArrayList<Integer> t = new ArrayList<>();
                t.add(b);
                map.put(a, t);
            }
            if (map.containsKey(b)) {
                ArrayList<Integer> t = map.get(b);
                t.add(a);
                map.put(b, t);
            } else {
                ArrayList<Integer> t = new ArrayList<>();
                t.add(a);
                map.put(b, t);
            }
        }
        Stack<Integer> s = new Stack<Integer>();
        s.push(source);
        while(!s.isEmpty()){
            int t = s.pop();
            if(t==destination)
                return true;
            for(int i:map.get(t)){
                if(!visited.contains(i)){
                    visited.add(i);
                    s.push(i);
                }
            }
        }
        return false;
    }
}
