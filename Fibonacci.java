import java.util.Scanner;

import jdk.vm.ci.code.CodeUtil.NumberedRefMapFormatter;
class Fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=a+b;
        boolean found=false;
        do{
            if(n==a){
                found=true;
                break;
            }
            a=b;
            b=c;
            c=a+b;
        }while(a<=n);
        if(found){
            System.out.println(n+" is a Fibonacci term");
        }
        else{
            System.out.println(n+" is not a Fibonacci term");
        }
    }
}