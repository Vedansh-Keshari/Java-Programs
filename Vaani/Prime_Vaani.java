package primespackage;

public class Prime_Vaani // actual class is Primes
{
    public boolean checkForPrime(int n){
        for(int x=2;x<n;x++){
            if(n%x==0){
                return false;
            }
        }
        return true;
    }
}


import primespackage;
import java.util.Scanner;
package twinprimespackage;

public class Twin_Primes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower limit of the range : ");
        int low=sc.nextInt();
        System.out.println("Enter upper limit of the range : ");
        int upp=sc.nextInt();
        Prime_Vaani pv=new Prime_Vaani();
    
        for(int x=low;x<=upp-2;x++){
            if(pv.checkForPrime(x) && pv.checkForPrime(x+2)){
                Systen.out.println("( "+x+" , "+(x+2)+" )");
            }
        }
    }
}
