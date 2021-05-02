import java.util.*;
import java.lang.Math;

public class ConvertBaseToBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase= scn.nextInt();
        scn.close();
        int cn=convertBaseToBase(n,sourceBase,destBase);
        System.out.println(cn);
     }
     public static int convertBaseToBase(int n,int sourceBase,int destBase)
     {
          int dec=anyBaseToDecimal(n,sourceBase);
          int bas=decimalToAnyBase(dec,destBase);
          return bas;
     }
     public static int anyBaseToDecimal(int n,int sourceBase)
     {
          int temp,rem,pos=0,dec=0;
          temp=n;
          while(temp>0)
          {
              rem=temp%10;
              dec=dec+(rem*(int)(Math.pow(sourceBase,pos)));
              pos++;
              temp=temp/10;
          }
          return dec;
     }
     public static int decimalToAnyBase(int dec,int destBase)
     {
          int temp,rem,pow=1,bas=0;
          temp=dec;
          while(temp>0)
          {
              rem=temp%10;
              bas=bas+(rem*pow);
              pow=pow*10;
              temp=temp/10;
          }
          return bas;
     }
    
  
  
}
