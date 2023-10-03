 import java.util.*;
 class Special{
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter any number");
         int n=sc.nextInt();
         int s=0;
         for(int x=n;x!=0;x/=10){
             int d=x%10;
             int p=1;
             for(int y=1;y<=d;y++){
                 p*=y;
             }
             s+=p;
         }
         if(n==s){
             System.out.println(n+" is a Special Number");
         }
         else{
             System.out.println(n+" is not a Special Number");
         }
     }
 }