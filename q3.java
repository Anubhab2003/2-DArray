import java.util.*;
public class q3{
    public static void main(String args[]){
        int matrix[][]={{4,7,8},{1,1,1},{4,5,8}};
        int n=matrix.length;
        int m=matrix[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[j][i]);
                
            }
            System.out.println();
        }
        
    }
}