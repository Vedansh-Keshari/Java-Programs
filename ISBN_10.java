import java.util.*;
class ISBN_10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int s=0;
        int i=1;
        for(int x=n;x!=0;x/=10){
            int d=x%10;
            s+=i*d;
            i++;
        }
        if(s%11==0){
            System.out.println(n+" is a ISBN Number");
        }
        else{
            System.out.println(n+" is not an ISBN Number");
        }
    }
}