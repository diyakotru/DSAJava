package MediumQues;

public class rotateImageBy90deg {
    public static void rotate(int[][] matrix) {
        //Approach-> Transpose + Reverse Rows (Clockwise)
        //Approach-> Transpose + Reverse Columns (AntiClockwise)
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1]=temp;
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

  
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("Rotated Matrix:");
        printMatrix(matrix);

    }

}
