import java.util.*;
class N_twoterms{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N%2==0){
            System.out.println((int)Math.pow(3,(N/2)-1));
        }
        else{
            System.out.println((int)Math.pow(2,(N/2)-1));
        }
    }
}
// 1 1 2 3 4 9 8 27 16 81 32 243 64 ...