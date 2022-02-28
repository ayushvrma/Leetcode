package Easy_Problems;

import java.util.ArrayList;
import java.util.HashMap;

public class find_centre_star_1791 {
    public int findCenter(int[][] edges) {
        int max = 0;
        int node=1;
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            if(map.containsKey(a)){
                ArrayList<Integer> t =map.get(a);
                t.add(b);
                map.put(a, t);
            }
            else{
                ArrayList<Integer> t = new ArrayList<>();
                t.add(b);
                map.put(a, t);
            }
            if(map.containsKey(b)){
                ArrayList<Integer> t = map.get(b);
                t.add(a);
                map.put(b, t);
            }
            else{
                ArrayList<Integer> t = new ArrayList<>();
                t.add(a);
                map.put(b, t); 
            }
        }
        System.out.println(map.toString());
        for(int i=1; i<=map.size();i++){
            if(map.containsKey(i)&&map.get(i).size()>max){
                max=map.get(i).size();
                node=i;
            }
        }
        return node;
    }
}