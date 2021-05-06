import java.util.Scanner;

public class check {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a[][]=new int[3][4];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=scn.nextInt();
            }
        }
        scn.close();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
