import java.util.*;
class Keprekar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        String s=String.valueOf(n);
        int l=s.length();
        int sq=n*n;
        //int sum=(int)(sq/(Math.pow(10,l)))+(sq%(Math.pow(10,l)));
        int sum=(sq/(int)(Math.pow(10,l)))+(sq%(int)(Math.pow(10,l)));
        if(sum==n){
            System.out.println(n+" is a Keprekar Number");
        }
        else{
            System.out.println(n+" is not a Keprekar Number");
        }
    }
}