package DSAJava.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfs {
    public static void main(String[] args) {
        // bfs-> breadth first search 
        //queue used
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

        Queue<Integer>q=new LinkedList<>();
        int[] visited =new int[n];
        Arrays.fill(visited, 0);
        int start=0;
        visited[0]=1;
        q.add(start);
        while(!q.isEmpty()){
            int ele=q.poll();
            visited[ele]=1;
            System.out.println(ele+" ");
            for(int i: graph.get(ele)){
                if(visited[i]==0){
                    q.add(i);
                    visited[i]=1;
                }

            }

        }




    }
}
