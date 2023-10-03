import java.util.*;
class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int s=0;
        int i=0;
        for(int x=n;x!=0;x/=10)
        {
            int d=x%10;
            i++;
        }
        for(int x=n;x!=0;x/=10)
        {
            int d=x%10;
            s+=(int)(Math.pow(d,i));
        }
        if(s==n)
        {
            System.out.println(n+" is an Armstrong Number");
        }
        else
        {
            System.out.println(n+" is not an Armstrong Number");
        }
    }
}

// 1634 , 8208 , 9474