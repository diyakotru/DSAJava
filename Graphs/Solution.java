import java.util.*;
class Pair{
  int d;
  int node;
  public Pair(int node,int d ){
    this.d=d;
    this.node=node;
  }
}
class Solution {
    public  static int[] shortestPath(int[][] edge, int N, int M) {
      int[] dis=new int[N];
      Arrays.fill(dis,Integer.MAX_VALUE);
      int n=edge.length;
      int m=edge[0].length;
      ArrayList<ArrayList<Integer>>list=new ArrayList<>();
      for(int i=0;i<N;i++){
        list.add(new ArrayList<>());
      }
      Queue<Pair>q=new LinkedList<>();
      for(int i=0;i<n;i++){
        
        int first=edge[i][0];
        int second=edge[i][1];
        list.get(first).add(second);
        list.get(second).add(first);


        
      }
      dis[0]=0;
      q.offer(new Pair(0,dis[0]));
      while(!q.isEmpty()){
        Pair p = q.poll();
        int node = p.node;
        int d = p.d;

        for(int i:list.get(node)){
          if(dis[i]>d+1){
            dis[i]=d+1;
            q.offer(new Pair(i,dis[i]));

          }
          
        }
      }

      return dis;


    }


    public static void main(String[] args) {
      int n = 9, m = 10;
      int[][] edge = {{0,1},{0,3},{3,4},{4,5},{5, 6},{1,2},{2,6},{6,7},{7,8},{6,8}};
      int [] val=shortestPath(edge,n,m);
      for(int i:val){
        System.out.println(i);
      }
    }
}
