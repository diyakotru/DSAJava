package DSAJava.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class loopdetectionusingdfs {
    static boolean detect(int[] visited,int start,List<List<Integer>> graph,int parent){
        visited[start]=1;
        for(int i:graph.get(start)){
            if(visited[i]==0){
                if(detect(visited, i, graph,start)==true){
                    return true;
                }
            }else if (i!=parent){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=6;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected graph example
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(2).add(4);
        graph.get(3).add(1);
        graph.get(3).add(5);
        graph.get(4).add(2);
        graph.get(4).add(5);
        graph.get(5).add(3);
        graph.get(5).add(4);
        int[] visited = new int[n];
        Arrays.fill(visited, 0);
        boolean hasCycle = detect(visited, 0, graph,-1);
        System.out.println("Cycle present? " + hasCycle);
    }
}
