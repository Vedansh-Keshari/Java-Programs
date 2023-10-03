import java.util.Scanner;
public class second_greatest {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value at index "+i);
            a[i]=sc.nextInt();
            b[i]=i;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(b[i]==1){
                System.out.println(a[i]);
            }
        }
    }
}
