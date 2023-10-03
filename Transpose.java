import java.util.Scanner;
import java.util.Arrays;
public class Transpose {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows of the matrix : ");
        int r=sc.nextInt();
        System.out.println("Enter number of columns of the matrix : ");
        int c=sc.nextInt();
        int ar[][]=new int[r][c];
        System.out.println("Enter elements (row-wise) in the 2D array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entered Matrix :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

        int tr[][]=new int[c][r];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                tr[j][i]=ar[i][j];
            }
        }
        System.out.println("Answer Matrix : ");
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                System.out.print(tr[j][i]+" ");
            }
            System.out.println();
        }

    }
}
