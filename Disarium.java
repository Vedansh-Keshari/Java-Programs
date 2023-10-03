import java.util.*;
class Disarium{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int s=0;
        int i=1;
        int r=0;
        for(int x=n;x!=0;x/=10){
            int d=x%10;
            r=r*10+d;
        }
        s=0;
        for(int x=r;x!=0;x/=10){
            int d=x%10;
            s+=(int)(Math.pow(d,i++));
        }
        if(s==n){
            System.out.println(n+" is a Disarium Number");
        }
        else{
            System.out.println(n+" is not a Disarium Number");
        }
    }
}