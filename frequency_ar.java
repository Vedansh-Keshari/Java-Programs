import java.util.Scanner;
public class frequency_ar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n =sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(ar[i]==ar[j]){
                    
                }
            }
            System.out.println();
        }
    }
}
