import java.util.Scanner;

import javax.print.event.PrintEvent;
//tell maximum number of people who existed in the party2
public class peopleAtT {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        // int S[]=new int[5];
        int E[]=new int[T];
        int L[]=new int[T];
        for(int i=0;i<T;i++){
            E[i]=sc.nextInt();
        }
        for(int i=0;i<T;i++){
            L[i]=sc.nextInt();
        }
        int sum=0;
        int max=sum;
        for(int i=0;i<T;i++){
            sum+=E[i]-L[i];
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
//A party has been organized on a cruise. The party organized for a limited time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.