import java.util.*;
public class Patterns_4 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int space=n/2;
        int star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                space--;
                star+=2;
            }
            else{
                space+=1;
                star-=2;
            }
            System.out.println();
        }
        scn.close();
    }
}
