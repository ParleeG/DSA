import java.util.Scanner;

public class Rotate_90 {
    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        scn.close();
        transpose(mat);
        reverseRowWise(mat);
        display(mat);
    }
     public static void transpose(int mat[][]){
        // logic for transposing
        int temp;
        for(int i=0;i<mat.length-1;i++){
            for(int j=i+1;j<mat.length;j++){
                temp=mat[j][i];
                mat[j][i]=mat[i][j];
                mat[i][j]=temp;
            }
        }
        
    }
    
    public static void reverseRowWise(int mat[][]){
        // logic for reversing each row
        int lo=0,hi=mat[0].length-1;
        for(int i=0;i<mat[0].length;i++){
            lo=0;
            hi=mat[0].length-1;
            while(lo<hi){
                int temp=mat[i][lo];
                mat[i][lo]=mat[i][hi];
                mat[i][hi]=temp;
                lo++;
                hi--;
            }
        }
        
    }


    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
