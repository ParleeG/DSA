import java.util.*;
public class First_And_Last_Index {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        scn.close();
        int f=first_index(a,k);
        int l=last_index(a,k);
        System.out.println(f);
        System.out.println(l);
    }
    public static int first_index(int a[],int k){
        int lo=0,hi=a.length-1,mid,f=-1;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(k==a[mid]){
                hi=mid-1;
                f=mid;
               }
            else if(k>a[mid]){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return f;
    }
    public static int last_index(int a[],int k){
        int lo=0,hi=a.length-1,mid,l=-1;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(k==a[mid]){
                lo=mid+1;
                l=mid;
            }
            else if(k>a[mid]){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return l;
    }
}
