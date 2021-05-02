
import java.util.*;
public class Spiral {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=scn.nextInt();
            }
        }
        scn.close();
        spiralDisplay(mat); 
    }
    public static void spiralDisplay(int mat[][]){
        int rmin=0,cmin=0,rmax=mat.length-1,cmax=mat[0].length-1;
        int count=0;
        int totElem=(mat.length*mat[0].length);
        while(count<totElem){
            for(int i=rmin,j=cmin;i<=rmax&&count<totElem;i++){
                System.out.println(mat[i][j]);
                count++;
            }
            for(int j=cmin+1,i=rmax;j<=cmax&&count<totElem;j++){
                System.out.println(mat[i][j]);
                count++;
            }
            for(int i=rmax-1,j=cmax;i>=rmin&&count<totElem;i--){
                System.out.println(mat[i][j]);
                count++;
            }
            for(int j=cmax-1,i=rmin;j>=cmin&&count<totElem;j--){
                System.out.println(mat[i][j]);
                count++;
            }
            rmin++;
            cmin++;
            rmax--;
            cmax--;
        }
        
    }
}
