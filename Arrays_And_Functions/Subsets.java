import java.util.*;
public class Subsets {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        scn.close();
        findSubsets(a);
    }
    public static void findSubsets(int a[]){
        int n_sets=(int)Math.pow(2,a.length);
        for(int i=0;i<n_sets;i++){
            int b_Num=getBinary(i);
            display(b_Num,a);
        }
    }
    public static int getBinary(int dec){
        int temp,rem,pow=1,bas=0;
        temp=dec;
        while(temp>0)
        {
            rem=temp%2;
            bas=bas+(rem*pow);
            pow=pow*10;
            temp=temp/2;
        }
        return bas;
    }
    public static void display(int b_Num,int a[]){
        int n=a.length;
        String s="";
        int r,ind=n-1;
        while(n!=0){
            r=b_Num%10;
            b_Num=b_Num/10;
            if(r==0){
                s="-\t"+s;
            }
            else{
                s=a[ind]+"\t"+s;
            } 
            n--;
            ind--;
        }
        System.out.println(s);
    } 
}
