// Perfect number is a number which is equal to the sum of it's positive divisors other than the number

import java.util.*;
public class perfect {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n=sc.nextInt();
        int s=0;
        for(int x=1;x<n;x++){ // for(int x=1;x<=(n/2);x++){
            if(n%x==0){
                s+=x;
            }
        }
        if(s==n){
            System.out.println(n+" is a Perfect Number");
        }
        else{
            System.out.println(n+" is not a Perfect Number");
        }
    }
}
