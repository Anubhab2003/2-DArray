import java.util.*;
public class q2{
    public static void main(String args[]){
        int matrix[][]={{4,7,8},{1,1,1},{1,2,3}};
        int n=matrix.length;
        int m=matrix[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==7){
                    count+=matrix[1][j];
                }
            }
        }
        System.out.println(count);
    }
}