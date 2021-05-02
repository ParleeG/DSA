package Two_D_Array;
import java.util.*;

public class State_Of_Wakanda {
    public static void main(String args[]){
    Scanner scn=new Scanner(System.in);
    int nr=scn.nextInt();
    int nc=scn.nextInt();
    int mat[][]=new int[nr][nc];
    for(int i=0;i<nr;i++){
        for(int j=0;j<nc;j++){
            mat[i][j]=scn.nextInt();
        }
    }
    System.out.println("Answer is from here");
    for(int j=0;j<nc;j++){
        if(j%2==0){
            for(int i=0;i<=nr-1;i++){
                System.out.println(mat[i][j]);
            }
        }
        else{
            for(int i=nr-1;i>=0;i--){
                System.out.println(mat[i][j]);
            }
        }
    }
    scn.close();
}
}
