import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int r=0;
        for(int x=n;x!=0;x/=10)
        {
            int d=x%10;
            r=r*10+d;
        }
        if(r==n)
        {
            System.out.println(n+" is a Palindrome Number");
        }
        else
        {
            System.out.println(n+" is not a Palindrome Number");
        }
    }
}