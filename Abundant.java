import java.util.*;
class Abundant{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int s=0;
        for(int x=1;x<n;x++){
            if(n%x==0){
                s+=x;
            }
        }
        if(n<s){
            System.out.println(n+" is an Abundant Number");
        }
        else{
            System.out.println(n+" is not an Abundant Number");
        }
    }
}