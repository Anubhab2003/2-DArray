import java.util.*;
public class diagonal{
    public static int rightdiagonal(int matrix[][]){
        int rightdiagonal=0;
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i+j==3){
                    rightdiagonal+=matrix[i][j];
                }
            }
        }
        return rightdiagonal;
    }
    public static int leftdiagonal(int matrix[][]){
        int leftdiagonal=0;
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    leftdiagonal+=matrix[i][j];
                }
            }
        }
        return leftdiagonal;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Sum of right diagonal : "+rightdiagonal(matrix));
        System.out.println("Sum of left diagonal : "+leftdiagonal(matrix));

    }

}