import java.util.*;

public class matrix {
    public static int larsearch(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
                
            }
        }
        return largest;
    }
    public static int smasearch(int matrix[][]){
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(smallest>matrix[i][j]){
                    smallest=matrix[i][j];
                }
            }
        }
        return smallest;
                
        
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        System.out.println("Enter the elements of 2-D Array");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("The largest number is " + larsearch(matrix));
        System.out.println("The smallest number is " + smasearch(matrix));
        
    }
}
