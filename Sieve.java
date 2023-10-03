import java.util.Scanner;
public class Sieve {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean A[]=new boolean[n];
        for(int x=0;x<n;x++){
            A[x]=true;
        }
        for(int x=2;x<n;x++){      //use Math.sqrt() for better performance
            if(A[x]==true){
                System.out.print(x+" ");
                for(int y=x;y<n;y+=x){
                    A[y]=false;
                }
            }
        }
        
    }




    // public boolean Sieve(int a){
    //     for(){
    //         if(a%x==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
