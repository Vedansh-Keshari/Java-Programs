import java.util.*;
class Automorphic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        String s1=String.valueOf(n);
        int l=s1.length();
        int p=n*n;
        String s2=String.valueOf(p);
        if(s2.endsWith(s1)){
            System.out.println(n+" is an Automorphic Number");
        }
        else{
            System.out.println(n+" is not an Automorphic Number");
        }

    }
}