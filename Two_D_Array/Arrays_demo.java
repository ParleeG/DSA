
import java.util.*;

public class Arrays_demo {
    public static void main(String[] args) throws Exception {
        // write your code here
            Scanner scn=new Scanner(System.in);
            int nr=scn.nextInt();
            int nc=scn.nextInt();
            int mat[][]=new int[nr][nc];
            for(int i=0;i<nr;i++){
                for(int j=0;j<nc;j++){
                    mat[i][j]=scn.nextInt();
                }
            }
            for(int i=0;i<nr;i++){
                for(int j=0;j<nc;j++){
                System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            scn.close();
            
        }
     }
