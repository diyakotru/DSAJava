package MediumQues;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        int r1=matrix.length;
        ArrayList<Integer>list=new ArrayList<>();
        int c=matrix[0].length;
        int l=0;
        int r=c-1;
        int t=0;
        int b=r1-1;
        while(l<=r&&t<=b){
            //right
            for(int i=l;i<=r;i++){
                list.add(matrix[t][i]);
            }
            t++;
            //bottom
            for(int i=t;i<=b;i++){
                list.add(matrix[i][r]);
            }
            r--;
            if(t<=b){
                //left
                for(int i=r;i>=l;i--){
                    list.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=r){
                //top
                for(int i=b;i>=t;i--){
                    list.add(matrix[i][l]);
                }
                l++;
            }

        }
        return list;
    }
    public static void main(String[] args) {
        int[][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer>list=new ArrayList<>();
        list=spiralOrder(matrix);
        System.out.println(list);
    }

}
