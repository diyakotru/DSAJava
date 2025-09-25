package DSAJava.Graphs;

import java.util.*;
class Pair{
    int i;
    int j;
    Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}

public class loopdetectionusingbfs {
    static boolean detect(int[] visited,int start,List<List<Integer>> graph ){
        Queue<Pair>q=new LinkedList<>();
        visited[start]=1;
        q.add(new Pair(start,-1));
        while(!q.isEmpty()){
            int node =q.peek().i;
            int parent=q.peek().j;
            q.poll();
            for(Integer p:graph.get(node)){
                if(visited[p]==0){
                    q.add(new Pair(p, node));
                    visited[p]=1;
                }
                else if (parent !=p){
                    return true;
                }
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
        boolean hasCycle = detect(visited, 0, graph);
        System.out.println("Cycle present? " + hasCycle);



    }
}
