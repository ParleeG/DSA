package Two_D_Array;
import java.util.*;


public class Matrix_Multiplication {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int nr1=scn.nextInt();
        int nc1=scn.nextInt();
        int mat1[][]=new int[nr1][nc1];
        for(int i=0;i<nr1;i++){
            for(int j=0;j<nc1;j++){
                mat1[i][j]=scn.nextInt();
            }
        }
        
        
        int nr2=scn.nextInt();
        int nc2=scn.nextInt();
        int mat2[][]=new int[nr2][nc2];
        for(int i=0;i<nr2;i++){
            for(int j=0;j<nc2;j++){
                mat2[i][j]=scn.nextInt();
            }
        }
        
        
        if(nc1!=nr2){
            System.out.println("Invalid input");
        }
        else{
                int mat3[][]=new int[nr1][nc2];
                for(int i=0;i<nr1;i++){
                    for(int j=0;j<nc2;j++){
                        for(int k=0;k<nc1;k++){
                            mat3[i][j]=mat3[i][j]+(mat1[i][k]*mat2[k][j]);
                        }
                        System.out.print(mat3[i][j]+" ");
                    }
                    System.out.println();
                }
                
        }
        scn.close();
    }
    
}
