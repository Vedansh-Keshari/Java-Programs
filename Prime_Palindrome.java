import java.util.*;
class Prime_Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        boolean prime=true;
        for(int x=2;x<n;x++){
            if(n%x==0){
                prime=false;
                break;
            }
        }
        if(prime){
            int r=0;
            for(int x=n;x!=0;x/=10){
                int d=x%10;
                r=r*10+d;
            }
            if(r==n){
                System.out.println(n+" is a Prime Palindrome Number");
            }
            else{
               System.out.println(n+" is not a Prime Palindrome Number");
            }
        }
        else{
            System.out.println(n+" is not a Prime Number");
        }
    }
}