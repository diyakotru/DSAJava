package DSAJava.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dfs {
    static void dfsTraversal(int start,List<List<Integer>> graph ,int[] visited){
        visited[start]=1;
        System.out.println(start+" ");
        for(int i:graph.get(start)){
            if(visited[i]==0){
                dfsTraversal(i, graph, visited);
            }
        }
    }
    public static void main(String[] args) {
        // dfs->depth first search 
        //recursion use hence stack used 
        int n = 6; 

        // Graph as adjacency list
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
        graph.get(5).add(3);
        int[] visited = new int[n];
        Arrays.fill(visited, 0);

        System.out.println("DFS starting from node 0:");
        dfsTraversal(0, graph, visited);
    }
}
