import java.util.*;
class Amicable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int s1=0;
        int s2=0;

        for(int x=1;x<a;x++){
            if(a%x==0){
                s1+=x;
            }
        }

        for(int x=1;x<b;x++){
            if(b%x==0){
                s2+=x;
            }
        }


        if(s1==b && s2==a){
            System.out.println("The pair ("+a+","+b+") is an Amicable Pair");
        }
        else{
            System.out.println("The pair ("+a+","+b+") is not an Amicable Pair");
        }
    }
}