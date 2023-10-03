import java.util.*;
public class Spiral {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ar[][]=new int[N][N];
        for(int x=0;x<N;x++){
            for(int y=0;y<N;y++){
                ar[x][y]=sc.nextInt();
            }
        }
        int A=0;
        // int B=n-1;
        // int C=n-1;
        // int D=0;
        for(int n=N;n>=1;n--){
            int count=0;
            while(true){        
                if(A!=n-1){
                    System.out.println(ar[0][A]);
                    A++;
                    count++;
                }
                if(count==n){
                    break;
                }
            }
            A=1;
            count=0;
            while(true){        
                if(A!=n-1){
                    System.out.println(ar[A][n-1]);
                    A++;
                    count++;
                }
                if(count==n-1){
                    break;
                }
            }
            A=n-2;
            count=0;
            while(true){        
                if(A!=0){
                    System.out.println(ar[n-1][A]);
                    A--;
                    count++;
                }
                if(count==n-1){
                    break;
                }
            }
            A=n-1;
            count=0;
            while(true){        
                if(A!=1){
                    System.out.println(ar[0][A]);
                    A--;
                    count++;
                }
                if(count==n-1){
                    break;
                }
            }
        }
    }
}
