import java.util.*;
public class q1{
    public static void main(String args[]){
        int matrix[][]={{4,7,8},{9,9,7}};
        int n=matrix.length;
        int m=matrix[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}