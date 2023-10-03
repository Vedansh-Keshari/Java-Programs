import java.util.*;
class Spy{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int s=0;
        int p=1;
        for(int x=n;x!=0;x/=10){
            int d=x%10;
            s+=d;
            p*=d;
        }
        if(s==p){
            System.out.println(n+" is a Spy Number");
        }
        else{
            System.out.println(n+" is not a Spy Number");
        }
    }
}