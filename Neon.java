import java.util.*;
class Neon{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int p=n*n;
        int s=0;
        for(int x=p;x!=0;x/=10){
            int d=x%10;
            s+=d;
        }
        if(s==n){
            System.out.println(n+" is a Neon Number");
        }
        else{
            System.out.println(n+" is not a Neon Number");
        }
    }
}